package com.sephirita.mangarift.data.model.response.chapter

data class ChapterRelationshipsAttributes(
    val name: String?,
    val altNames: List<Map<String, String>>?,
    val locked: Boolean?,
    val website: String?,
    val description: String?,
    val mangaUpdates: String?,
    val focusedLanguages: List<String>?,
    val official: Boolean?,
    val verified: Boolean?,
    val inactive: Boolean?,
    val exLicensed: Boolean?,
    val createdAt: String?,
    val updatedAt: String?,
    val version: Int?
)