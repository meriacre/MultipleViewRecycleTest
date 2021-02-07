package md.merit.multipleviewrecycletest

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item1lo.view.*
import kotlinx.android.synthetic.main.item2lo.view.*

interface BaseHolder<T> {


   fun bind(item:T)


    class FirstHolder( itemView: View): BaseHolder<Item1>, RecyclerView.ViewHolder(itemView) {
        override fun bind(item: Item1) {
            val name = itemView.tvName
            val surname = itemView.tvSurname
            name.text = item.name
            surname.text = item.surname
        }
    }

    class  SecondHolder(itemView: View): BaseHolder<Item2>, RecyclerView.ViewHolder(itemView) {
        override fun bind(item: Item2) {
            val photo = itemView.tvPhotoName
            photo.text = item.imgName
        }
    }

}
