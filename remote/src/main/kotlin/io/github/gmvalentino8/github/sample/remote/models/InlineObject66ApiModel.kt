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

import io.github.gmvalentino8.github.sample.remote.models.ReposRepoNameBranchesBranchProtectionRequiredPullRequestReviewsBypassPullRequestAllowancesApiModel
import io.github.gmvalentino8.github.sample.remote.models.ReposRepoNameBranchesBranchProtectionRequiredPullRequestReviewsDismissalRestrictionsApiModel

import kotlinx.serialization.*

/**
 * 
 * @param dismissalRestrictions 
 * @param dismissStaleReviews Set to `true` if you want to automatically dismiss approving reviews when someone pushes a new commit.
 * @param requireCodeOwnerReviews Blocks merging pull requests until [code owners](https://docs.github.com/articles/about-code-owners/) have reviewed.
 * @param requiredApprovingReviewCount Specifies the number of reviewers required to approve pull requests. Use a number between 1 and 6 or 0 to not require reviewers.
 * @param bypassPullRequestAllowances 
 */
@Serializable
data class InlineObject66ApiModel(
    @SerialName(value = "dismissal_restrictions")
    val dismissalRestrictions: ReposRepoNameBranchesBranchProtectionRequiredPullRequestReviewsDismissalRestrictionsApiModel? = null,
    /* Set to `true` if you want to automatically dismiss approving reviews when someone pushes a new commit. */
    @SerialName(value = "dismiss_stale_reviews")
    val dismissStaleReviews: kotlin.Boolean? = null,
    /* Blocks merging pull requests until [code owners](https://docs.github.com/articles/about-code-owners/) have reviewed. */
    @SerialName(value = "require_code_owner_reviews")
    val requireCodeOwnerReviews: kotlin.Boolean? = null,
    /* Specifies the number of reviewers required to approve pull requests. Use a number between 1 and 6 or 0 to not require reviewers. */
    @SerialName(value = "required_approving_review_count")
    val requiredApprovingReviewCount: kotlin.Int? = null,
    @SerialName(value = "bypass_pull_request_allowances")
    val bypassPullRequestAllowances: ReposRepoNameBranchesBranchProtectionRequiredPullRequestReviewsBypassPullRequestAllowancesApiModel? = null
) {

}

