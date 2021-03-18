package com.danielvilha.mygarden.data

import androidx.room.Embedded
import androidx.room.Relation

/**
 * Created by danielvilha on 16/09/20
 * https://github.com/danielvilha
 */
data class PlantAndGardenPlantings(
    @Embedded
    val plant: Plant,

    @Relation(parentColumn = "id", entityColumn = "plant_id")
    val gardenPlantings: List<GardenPlanting> = emptyList()
)