/**
 * GitHub v3 REST API
 *
 * GitHub's v3 REST API.
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.github.gmvalentino8.github.sample.remote.models

import io.github.gmvalentino8.github.sample.remote.models.NullableMinusSimpleMinusUserApiModel
import io.github.gmvalentino8.github.sample.remote.models.ReactionMinusRollupApiModel

import kotlinx.serialization.*

/**
 * A team discussion is a persistent record of a free-form conversation within a team.
 * @param author 
 * @param body The main text of the discussion.
 * @param bodyHtml 
 * @param bodyVersion The current version of the body content. If provided, this update operation will be rejected if the given version does not match the latest version on the server.
 * @param commentsCount 
 * @param commentsUrl 
 * @param createdAt 
 * @param lastEditedAt 
 * @param htmlUrl 
 * @param nodeId 
 * @param number The unique sequence number of a team discussion.
 * @param pinned Whether or not this discussion should be pinned for easy retrieval.
 * @param `private` Whether or not this discussion should be restricted to team members and organization administrators.
 * @param teamUrl 
 * @param title The title of the discussion.
 * @param updatedAt 
 * @param url 
 * @param reactions 
 */
@Serializable
data class TeamMinusDiscussionApiModel(
    @SerialName(value = "author")
    val author: NullableMinusSimpleMinusUserApiModel?,
    /* The main text of the discussion. */
    @SerialName(value = "body")
    val body: kotlin.String,
    @SerialName(value = "body_html")
    val bodyHtml: kotlin.String,
    /* The current version of the body content. If provided, this update operation will be rejected if the given version does not match the latest version on the server. */
    @SerialName(value = "body_version")
    val bodyVersion: kotlin.String,
    @SerialName(value = "comments_count")
    val commentsCount: kotlin.Int,
    @SerialName(value = "comments_url")
    val commentsUrl: kotlin.String,
    @SerialName(value = "created_at")
    val createdAt: kotlin.String,
    @SerialName(value = "last_edited_at")
    val lastEditedAt: kotlin.String?,
    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String,
    @SerialName(value = "node_id")
    val nodeId: kotlin.String,
    /* The unique sequence number of a team discussion. */
    @SerialName(value = "number")
    val number: kotlin.Int,
    /* Whether or not this discussion should be pinned for easy retrieval. */
    @SerialName(value = "pinned")
    val pinned: kotlin.Boolean,
    /* Whether or not this discussion should be restricted to team members and organization administrators. */
    @SerialName(value = "private")
    val `private`: kotlin.Boolean,
    @SerialName(value = "team_url")
    val teamUrl: kotlin.String,
    /* The title of the discussion. */
    @SerialName(value = "title")
    val title: kotlin.String,
    @SerialName(value = "updated_at")
    val updatedAt: kotlin.String,
    @SerialName(value = "url")
    val url: kotlin.String,
    @SerialName(value = "reactions")
    val reactions: ReactionMinusRollupApiModel? = null
) {

}

