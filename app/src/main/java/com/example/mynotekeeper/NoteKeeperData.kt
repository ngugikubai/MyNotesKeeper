package com.example.mynotekeeper

// Creating courseId as an assign once variable(immutable)
data class CourseInfo (val courseId:String, val title:String) {
    override fun toString(): String {
        return title
    }
}

// Creating the variable course as a mutable variable
data class NoteInfo(var course: CourseInfo? = null, var title:String? = null, var text:String? = null)