package id.Uas_0591.ui.favorite

import id.Uas_0591.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}