package com.example.createdrecuclerview.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.createdrecuclerview.databinding.ItemTaskBinding
import com.example.createdrecuclerview.model.Task

class TaskAdapter : Adapter<TaskAdapter.TaskViewHolder>() {
    val list = arrayListOf<Task>(
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
        Task("Joodara","16"),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder(
            ItemTaskBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class TaskViewHolder(private val binding: ItemTaskBinding) : ViewHolder(binding.root) {

        fun bind(task: Task) {
            binding.tvUserName.text = task.userTitle
            binding.tvUserAge.text = task.userAge
        }
    }
}
