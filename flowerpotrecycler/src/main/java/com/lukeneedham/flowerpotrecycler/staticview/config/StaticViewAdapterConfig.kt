package com.lukeneedham.flowerpotrecycler.staticview.config

import com.lukeneedham.flowerpotrecycler.staticview.StaticViewRecyclerAdapter
import com.lukeneedham.flowerpotrecycler.staticview.delegates.StaticViewAdapterFeatureDelegate

/**
 * A basic [StaticViewRecyclerAdapterConfig].
 * By default, it uses no feature delegates.
 */
class StaticViewAdapterConfig :
    StaticViewRecyclerAdapterConfig {
    override var featureDelegateCreators: MutableList<(adapter: StaticViewRecyclerAdapter) -> StaticViewAdapterFeatureDelegate> =
        mutableListOf()
}
