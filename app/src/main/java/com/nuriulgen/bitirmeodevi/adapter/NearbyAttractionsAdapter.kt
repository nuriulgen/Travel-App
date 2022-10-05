package com.nuriulgen.bitirmeodevi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nuriulgen.bitirmeodevi.R
import com.nuriulgen.bitirmeodevi.domain.model.nearbyAttractions.NearbyAttractionsModel
import kotlinx.android.synthetic.main.top_destination_recycler_row.view.*

class NearbyAttractionsAdapter(private val itemList: List<NearbyAttractionsModel>): RecyclerView.Adapter<NearbyAttractionsAdapter.NearbyAttractionsViewHolder>() {

    class NearbyAttractionsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NearbyAttractionsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.nearby_attractions_recycler_row,parent,false)
        return NearbyAttractionsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NearbyAttractionsViewHolder, position: Int) {
        holder.itemView.titleText.text = itemList[position].city
        holder.itemView.subTitleText.text = itemList[position].country
    }

    override fun getItemCount(): Int {
      return itemList.size
    }

}