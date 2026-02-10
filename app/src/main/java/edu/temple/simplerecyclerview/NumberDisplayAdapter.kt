package edu.temple.simplerecyclerview

import android.R.attr.textSize
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter /* TODO Step 3a: Provide Adapter Parent */ {

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    // TODO Step 3b: Complete function definitions for adapter
class NumberDisplayAdapt : RecyclerView.Adapter<NumberDisplayAdapt.NumberViewHolder>(){

        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): NumberDisplayAdapt.NumberViewHolder {
            textSize = 22f
        }

        override fun onBindViewHolder(
            holder: NumberDisplayAdapt.NumberViewHolder,
            position: Int
        ) {
          holder.textView.text = ((position + 1) * 5).toString()
        }

        override fun getItemCount() = 2000

        class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder(ItemView = TextView){}
    }
}