package id.Uas_0591.ui.event

import id.Uas_0591.data.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}