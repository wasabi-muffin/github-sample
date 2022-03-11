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


import kotlinx.serialization.*

/**
 * 
 * @param id 
 * @param name 
 * @param visibility 
 * @param default 
 * @param runnersUrl 
 * @param allowsPublicRepositories 
 * @param selectedOrganizationsUrl 
 */
@Serializable
data class RunnerMinusGroupsMinusEnterpriseApiModel(
    @Contextual @SerialName(value = "id")
    val id: kotlin.Double,
    @SerialName(value = "name")
    val name: kotlin.String,
    @SerialName(value = "visibility")
    val visibility: kotlin.String,
    @SerialName(value = "default")
    val default: kotlin.Boolean,
    @SerialName(value = "runners_url")
    val runnersUrl: kotlin.String,
    @SerialName(value = "allows_public_repositories")
    val allowsPublicRepositories: kotlin.Boolean,
    @SerialName(value = "selected_organizations_url")
    val selectedOrganizationsUrl: kotlin.String? = null
) {

}
