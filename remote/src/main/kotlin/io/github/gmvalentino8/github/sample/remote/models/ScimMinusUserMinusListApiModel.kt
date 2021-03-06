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

import io.github.gmvalentino8.github.sample.remote.models.ScimMinusUserApiModel

import kotlinx.serialization.*

/**
 * SCIM User List
 * @param schemas SCIM schema used.
 * @param totalResults 
 * @param itemsPerPage 
 * @param startIndex 
 * @param resources 
 */
@Serializable
data class ScimMinusUserMinusListApiModel(
    /* SCIM schema used. */
    @SerialName(value = "schemas")
    val schemas: kotlin.collections.List<kotlin.String>,
    @SerialName(value = "totalResults")
    val totalResults: kotlin.Int,
    @SerialName(value = "itemsPerPage")
    val itemsPerPage: kotlin.Int,
    @SerialName(value = "startIndex")
    val startIndex: kotlin.Int,
    @SerialName(value = "Resources")
    val resources: kotlin.collections.List<ScimMinusUserApiModel>
) {

}

