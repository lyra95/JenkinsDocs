package com.github.lyra95.jenkinsdocs

import com.intellij.lang.documentation.DocumentationProvider

public class JenkinsHoverDocProvider : DocumentationProvider {
    private val docMap: Map<String, String>  = mapOf(
        "pipeline" to "Pipeline is a suite of plugins which supports implementing and integrating continuous delivery pipelines into Jenkins.",
        "stage" to "A stage block is used to organize the pipeline into different stages.",
        "steps" to "Steps are the building blocks of a Jenkins Pipeline. They define what actions are performed in the pipeline."
    )


}