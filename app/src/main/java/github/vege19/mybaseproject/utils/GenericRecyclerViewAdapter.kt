package github.vege19.mybaseproject.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class GenericAdapter<T>(private val layout: Int, private val list: List<T>, private val action: (
        viewHolder: GenericAdapter.ViewHolder,
        view: View,
        entry: T,
        position: Int) -> Unit) : RecyclerView.Adapter<GenericAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenericAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(layout, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        action.invoke(holder, holder.view, list[position], position)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val view = view
    }

}