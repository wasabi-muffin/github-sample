package io.github.gmvalentino8.github.sample.ui.components.search

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.gmvalentino8.github.sample.domain.entities.Issue
import io.github.gmvalentino8.github.sample.domain.entities.PullRequest
import io.github.gmvalentino8.github.sample.ui.R
import io.github.gmvalentino8.github.sample.ui.primitives.Github
import io.github.gmvalentino8.github.sample.ui.primitives.GithubTheme
import io.github.gmvalentino8.github.sample.ui.primitives.Gray
import io.github.gmvalentino8.github.sample.ui.utils.DateString
import io.github.gmvalentino8.github.sample.ui.utils.IssueStatus
import io.github.gmvalentino8.github.sample.ui.utils.PullRequestStatus

@Composable
fun SearchIssueResultItem(
    @DrawableRes icon: Int,
    iconTint: Color,
    repoName: String,
    number: String,
    title: String,
    durationBeforeNow: String,
    modifier: Modifier = Modifier
) = Row(
    horizontalArrangement = Arrangement.spacedBy(16.dp),
    verticalAlignment = Alignment.Top,
    modifier = modifier
        .fillMaxWidth()
        .padding(16.dp)
) {
    Icon(
        painter = painterResource(id = icon),
        tint = iconTint,
        contentDescription = null,
        modifier = Modifier.size(24.dp),
    )
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier.weight(1f)
    ) {
        Text(
            text = "$repoName #$number",
            style = MaterialTheme.typography.h4,
            fontWeight = FontWeight.Normal,
            color = Gray.v700,
            modifier = Modifier.fillMaxWidth(),
        )
        Text(
            text = title,
            style = MaterialTheme.typography.h4,
            fontWeight = FontWeight.Bold,
            color = Github.Black,
        )
    }
    Text(
        text = durationBeforeNow,
        style = MaterialTheme.typography.h4,
        fontWeight = FontWeight.Normal,
        color = Gray.v700,
    )
}

@Composable
fun SearchIssueResultItem(
    issue: Issue,
    modifier: Modifier = Modifier,
) {
    val status = IssueStatus(issue.status)
    SearchIssueResultItem(
        icon = status.icon,
        iconTint = status.iconTint,
        repoName = issue.repoName,
        number = issue.number.toString(),
        title = issue.title,
        durationBeforeNow = DateString(issue.createdAt).toDurationUntilToday(),
        modifier = modifier,
    )
}

@Composable
fun SearchPullRequestResultItem(
    pullRequest: PullRequest,
    modifier: Modifier = Modifier,
) {
    val status = PullRequestStatus(pullRequest.status)
    SearchIssueResultItem(
        icon = status.icon,
        iconTint = status.iconTint,
        repoName = pullRequest.repoName,
        number = pullRequest.number.toString(),
        title = pullRequest.title,
        durationBeforeNow = DateString(pullRequest.createdAt).toDurationUntilToday(),
        modifier = modifier,
    )
}

@Preview
@Composable
fun Preview_SearchIssueResultItem() {
    GithubTheme {
        SearchIssueResultItem(
            icon = R.drawable.git_pull_request,
            iconTint = Github.Black,
            repoName = "repo/name",
            number = "1",
            title = "title",
            durationBeforeNow = "1d",
            modifier = Modifier.background(Color.White)
        )
    }
}
