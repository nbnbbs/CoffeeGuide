package com.argentum442.coffeeguide.coffeeguide

import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class PlacesAdapter : ListAdapter<Place, PlacesAdapter.PlaceViewHolder>(CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PlaceViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_places, parent, false)
    )

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class PlaceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val titleView: TextView = itemView.findViewById(R.id.item_places_title)
        private val addressView: TextView = itemView.findViewById(R.id.item_places_address)

        fun bind(place: Place) {
            titleView.text = place.title
            addressView.text = place.address
        }

    }

    companion object {

        private val CALLBACK = object : DiffUtil.ItemCallback<Place>() {

            override fun areItemsTheSame(oldItem: Place, newItem: Place) = oldItem.title != newItem.title

            override fun areContentsTheSame(oldItem: Place, newItem: Place) = oldItem == newItem

        }

    }

}