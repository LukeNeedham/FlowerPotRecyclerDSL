package com.lukeneedham.flowerpotrecycler.autoadapter

import com.lukeneedham.flowerpotrecycler.autoadapter.builderbinder.BuilderBinder
import com.lukeneedham.flowerpotrecycler.delegatedadapter.ConfigurableRecyclerAdapter
import com.lukeneedham.flowerpotrecycler.delegatedadapter.config.RecyclerAdapterConfig

object RecyclerAdapterAutoGenerator {
    fun <ItemType> generate(
        builderBinder: BuilderBinder<ItemType>,
        config: RecyclerAdapterConfig<ItemType>?
    ) = ConfigurableRecyclerAdapter(config) {
        AutoGeneratedRecyclerItemView(it, builderBinder)
    }
}