package com.sephirita.mangarift.presentation.component.search

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(
    onSearch: (String) -> Unit
) {
    var text by rememberSaveable { mutableStateOf("") }
    var expanded by rememberSaveable { mutableStateOf(false) }

    Box(
        modifier = Modifier.fillMaxWidth().height(90.dp)
    ) {
        SearchBar(
            modifier = Modifier.align(Alignment.TopCenter),
            inputField = {
                SearchBarDefaults.InputField(
                    query = text,
                    onQueryChange = { text = it },
                    onSearch = {
                        onSearch(text)
                        expanded = false
                    },
                    expanded = expanded,
                    onExpandedChange = { expanded = it },
                    placeholder = { Text("Nome da obra") },
                    leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                    trailingIcon = {
                        if (expanded) {
                            Icon(
                                Icons.Default.Close,
                                modifier = Modifier.clickable { expanded = false },
                                contentDescription = "Close Search Bar"
                            )
                        }
                    },
                )
            },
            expanded = expanded,
            onExpandedChange = { expanded = it }
        ) {
//        repeat(4) { idx ->
//            val resultText = "Suggestion $idx"
//            ListItem(
//                headlineContent = { Text(resultText) },
//                supportingContent = { Text("Additional info") },
//                leadingContent = { Icon(Icons.Filled.Star, contentDescription = null) },
//                modifier = Modifier
//                    .clickable {
//                        text = resultText
//                        active = false
//                    }
//                    .fillMaxWidth()
//                    .padding(horizontal = 16.dp, vertical = 4.dp)
//            )
//        }
        }
    }
}