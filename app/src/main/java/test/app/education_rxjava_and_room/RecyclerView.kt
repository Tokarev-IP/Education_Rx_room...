package test.app.education_rxjava_and_room

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerView() : RecyclerView.Adapter<MyViewHolder>() {

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.mTextView_1.text = "1"
        holder.mTextView_2.text = "2"
    }

    override fun getItemCount(): Int {
        return 15
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val mInfalter = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.recycler_view, parent, false)
        return MyViewHolder(mInfalter)
    }

}

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val mTextView_1: TextView = itemView.findViewById(R.id.text_view_1)
    val mTextView_2: TextView = itemView.findViewById(R.id.text_view_2)
}