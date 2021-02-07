package md.merit.multipleviewrecycletest

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter (private val adapterDataList: List<Any>, private val context: Context): RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
           1 -> {
                BaseHolder.FirstHolder(
                    LayoutInflater.from(context)
                        .inflate(R.layout.item1lo, parent, false)
                )
        }
           0 -> {
                BaseHolder.SecondHolder( LayoutInflater.from(context)
                    .inflate(R.layout.item2lo,parent,false))
            }

                else -> throw IllegalArgumentException("Invalid view type")

        }
    }

    override fun getItemCount(): Int = adapterDataList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val element = adapterDataList[position]
        when (holder) {
            is BaseHolder.FirstHolder -> holder.bind(element as Item1)
            is BaseHolder.SecondHolder -> holder.bind(element as Item2)
            else -> throw IllegalArgumentException()
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (adapterDataList[position]) {
            is Item1 -> 1
            is Item2 -> 0
            else -> throw IllegalArgumentException("Invalid type of data $position")
        }
    }
}