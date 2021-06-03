package com.example.lihatbuku

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListBookAdapter(private val listBook: ArrayList<BookItem> ): RecyclerView.Adapter<ListBookAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
//        TODO("Not yet implemented")
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_books, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
//        TODO("Not yet implemented")
        val (name, year, detail, author, penerbit, photo) = listBook[position]
        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(150, 220))
            .into(holder.imgPhoto)
        holder.tvName.text = name
        holder.tvYear.text = year
        holder.tvDetail.text = detail

        val mContext = holder.itemView.context
        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailActivity::class.java)
            moveDetail.putExtra(DetailActivity.EXTRA_NAME, name)
            moveDetail.putExtra(DetailActivity.EXTRA_YEAR, year)
            moveDetail.putExtra(DetailActivity.EXTRA_DETAIL, detail)
            moveDetail.putExtra(DetailActivity.EXTRA_IMAGE, photo)
            moveDetail.putExtra(DetailActivity.EXTRA_AUTHOR, author)
            moveDetail.putExtra(DetailActivity.EXTRA_PENERBIT, penerbit)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
        return listBook.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvYear: TextView = itemView.findViewById(R.id.tv_item_year)
        val tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}