package com.example.herbs


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.herbs.databinding.ItemSpiceBinding

class StudentAdapter :
    RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    private var clickListener: ClickListener? = null

    inner class StudentViewHolder(val binding: ItemSpiceBinding) :
        RecyclerView.ViewHolder(binding.root)

    private val diffCallback = object : DiffUtil.ItemCallback<Student>() {
        override fun areItemsTheSame(oldItem: Student, newItem: Student): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Student, newItem: Student): Boolean {
            return oldItem == newItem
        }
    }

    private val differ = AsyncListDiffer(this, diffCallback)
    var students: List<Student>
        get() = differ.currentList
        set(value) {
            differ.submitList(value)
        }

    override fun getItemCount() = students.size

    fun setClickListener(clickListener: ClickListener?) {
        this.clickListener = clickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val binding = ItemSpiceBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return StudentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val student = students[position]
        val context = holder.itemView.context

        holder.binding.apply {
            tvName.text = student.name
            tvNim.text = student.nim

            //Glide.with(root.context)
            //    .load(student.picture)
            //    .centerCrop()
            //    .into(ivTrainer)
        }
        holder.itemView.setOnClickListener { clickListener?.onItemClicked(student) }
    }

    interface ClickListener {
        fun onItemClicked(student: Student)
    }
}