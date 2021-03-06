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
 * @param tagName The name of the tag.
 * @param targetCommitish Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists. Default: the repository's default branch (usually `master`).
 * @param name The name of the release.
 * @param body Text describing the contents of the tag.
 * @param draft `true` to create a draft (unpublished) release, `false` to create a published one.
 * @param prerelease `true` to identify the release as a prerelease. `false` to identify the release as a full release.
 * @param discussionCategoryName If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. For more information, see \"[Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository).\"
 * @param generateReleaseNotes Whether to automatically generate the name and body for this release. If `name` is specified, the specified name will be used; otherwise, a name will be automatically generated. If `body` is specified, the body will be pre-pended to the automatically generated notes.
 */
@Serializable
data class InlineObject130ApiModel(
    /* The name of the tag. */
    @SerialName(value = "tag_name")
    val tagName: kotlin.String,
    /* Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists. Default: the repository's default branch (usually `master`). */
    @SerialName(value = "target_commitish")
    val targetCommitish: kotlin.String? = null,
    /* The name of the release. */
    @SerialName(value = "name")
    val name: kotlin.String? = null,
    /* Text describing the contents of the tag. */
    @SerialName(value = "body")
    val body: kotlin.String? = null,
    /* `true` to create a draft (unpublished) release, `false` to create a published one. */
    @SerialName(value = "draft")
    val draft: kotlin.Boolean? = false,
    /* `true` to identify the release as a prerelease. `false` to identify the release as a full release. */
    @SerialName(value = "prerelease")
    val prerelease: kotlin.Boolean? = false,
    /* If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. For more information, see \"[Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository).\" */
    @SerialName(value = "discussion_category_name")
    val discussionCategoryName: kotlin.String? = null,
    /* Whether to automatically generate the name and body for this release. If `name` is specified, the specified name will be used; otherwise, a name will be automatically generated. If `body` is specified, the body will be pre-pended to the automatically generated notes. */
    @SerialName(value = "generate_release_notes")
    val generateReleaseNotes: kotlin.Boolean? = false
) {

}

