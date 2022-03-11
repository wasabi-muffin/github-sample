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
 * @param head The name of the branch where your changes are implemented. For cross-repository pull requests in the same network, namespace `head` with a user like this: `username:branch`.
 * @param base The name of the branch you want the changes pulled into. This should be an existing branch on the current repository. You cannot submit a pull request to one repository that requests a merge to a base of another repository.
 * @param title The title of the new pull request.
 * @param body The contents of the pull request.
 * @param maintainerCanModify Indicates whether [maintainers can modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull request.
 * @param draft Indicates whether the pull request is a draft. See \"[Draft Pull Requests](https://docs.github.com/en/articles/about-pull-requests#draft-pull-requests)\" in the GitHub Help documentation to learn more.
 * @param issue 
 */
@Serializable
data class InlineObject117ApiModel(
    /* The name of the branch where your changes are implemented. For cross-repository pull requests in the same network, namespace `head` with a user like this: `username:branch`. */
    @SerialName(value = "head")
    val head: kotlin.String,
    /* The name of the branch you want the changes pulled into. This should be an existing branch on the current repository. You cannot submit a pull request to one repository that requests a merge to a base of another repository. */
    @SerialName(value = "base")
    val base: kotlin.String,
    /* The title of the new pull request. */
    @SerialName(value = "title")
    val title: kotlin.String? = null,
    /* The contents of the pull request. */
    @SerialName(value = "body")
    val body: kotlin.String? = null,
    /* Indicates whether [maintainers can modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull request. */
    @SerialName(value = "maintainer_can_modify")
    val maintainerCanModify: kotlin.Boolean? = null,
    /* Indicates whether the pull request is a draft. See \"[Draft Pull Requests](https://docs.github.com/en/articles/about-pull-requests#draft-pull-requests)\" in the GitHub Help documentation to learn more. */
    @SerialName(value = "draft")
    val draft: kotlin.Boolean? = null,
    @SerialName(value = "issue")
    val issue: kotlin.Int? = null
) {

}
