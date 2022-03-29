package com.interswitchug.uitest.data.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.interswitchug.uitest.data.models.Menu
import com.interswitchug.uitest.databinding.SingleMenuItemBinding

class MenuAdapter(val context: Context, val list: MutableList<Menu>): RecyclerView.Adapter<MenuAdapter.MenuHolder>() {

    inner class MenuHolder(val binding: SingleMenuItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun setMenuData(menu: Menu) {
            binding.title.text = menu.title
            menu.icon?.let { binding.icon.setImageResource(it) }

            binding.root.setOnClickListener {
                Toast.makeText(context,menu.title,Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuHolder {
        return MenuHolder(SingleMenuItemBinding.inflate(LayoutInflater.from(context),parent,false))
    }

    override fun onBindViewHolder(holder: MenuHolder, position: Int) {
        holder.setMenuData(list[position])
    }

    override fun getItemCount(): Int = list.size
}