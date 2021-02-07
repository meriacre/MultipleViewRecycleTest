package md.merit.multipleviewrecycletest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list:MutableList<Any> = ArrayList()
        list.add(Item1("Andrew", "Murrey"))
        list.add(Item1("Andrei", "Meri"))
        list.add(Item2("Imagineaa"))
        list.add(Item2("Imagin2"))
        list.add(Item1("Andrei", "Meria"))

Log.d("test", list.toString())
        val adapter = Adapter(list,this)
        rvMenu.layoutManager = LinearLayoutManager(this)
        rvMenu.adapter = adapter



    }
}