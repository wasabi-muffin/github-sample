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

import io.github.gmvalentino8.github.sample.remote.models.ScimGroupListEnterpriseMetaApiModel
import io.github.gmvalentino8.github.sample.remote.models.ScimUserListEnterpriseEmailsApiModel
import io.github.gmvalentino8.github.sample.remote.models.ScimUserListEnterpriseNameApiModel
import io.github.gmvalentino8.github.sample.remote.models.ScimV2EnterprisesEnterpriseUsersGroupsApiModel

import kotlinx.serialization.*

/**
 * 
 * @param schemas 
 * @param id 
 * @param externalId 
 * @param userName 
 * @param name 
 * @param emails 
 * @param groups 
 * @param active 
 * @param meta 
 */
@Serializable
data class ScimUserListEnterpriseResourcesApiModel(
    @SerialName(value = "schemas")
    val schemas: kotlin.collections.List<kotlin.String>,
    @SerialName(value = "id")
    val id: kotlin.String,
    @SerialName(value = "externalId")
    val externalId: kotlin.String? = null,
    @SerialName(value = "userName")
    val userName: kotlin.String? = null,
    @SerialName(value = "name")
    val name: ScimUserListEnterpriseNameApiModel? = null,
    @SerialName(value = "emails")
    val emails: kotlin.collections.List<ScimUserListEnterpriseEmailsApiModel>? = null,
    @SerialName(value = "groups")
    val groups: kotlin.collections.List<ScimV2EnterprisesEnterpriseUsersGroupsApiModel>? = null,
    @SerialName(value = "active")
    val active: kotlin.Boolean? = null,
    @SerialName(value = "meta")
    val meta: ScimGroupListEnterpriseMetaApiModel? = null
) {

}

