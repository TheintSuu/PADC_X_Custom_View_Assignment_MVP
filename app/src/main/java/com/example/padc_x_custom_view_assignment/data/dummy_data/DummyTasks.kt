package com.example.padc_x_custom_view_assignment.data.dummy_data

import com.example.padc_x_custom_view_assignment.data.vos.ProfilesVO
import com.example.padc_x_custom_view_assignment.data.vos.TasksVO


fun getDummyTasks() : List<TasksVO>{
    val taskOne = TasksVO()
    taskOne.attachedFiles = 5
    taskOne.message = 3
    taskOne.task_nCount = 163
    taskOne.taskStatus = "In progress"
    taskOne.taskType = "#Design"
    taskOne.profileImage = "https://storage.googleapis.com/mmds_digi_learn/users/profiles/img_5ef5cc8be971f_1593166987.png"

    val taskTwo = TasksVO()
    taskTwo.attachedFiles = 2
    taskTwo.message = 8
    taskTwo.task_nCount = 158
    taskTwo.taskStatus = "Done"
    taskTwo.taskType = "#Design"
    taskTwo.profileImage = "https://storage.googleapis.com/mmds_digi_learn/users/profiles/img_5f1182b9c7a2b_1594983097.jpg"// ""

    val taskThree = TasksVO()
    taskThree.attachedFiles = 8
    taskThree.message = 4
    taskThree.task_nCount = 157
    taskThree.taskStatus = "Review"
    taskThree.taskType = "#Frontend"
    taskThree.profileImage = "https://storage.googleapis.com/mmds_digi_learn/users/profiles/img_5eff260d860c6_1593779725.png"

    return arrayListOf(taskOne,taskTwo,taskThree)
}


fun getDummyProfiles() : List<ProfilesVO>{
    val profileOne = ProfilesVO()
    profileOne.profileImage = "https://storage.googleapis.com/mmds_digi_learn/users/profiles/img_5ef5cc8be971f_1593166987.png"
    profileOne.closedTask = 361
    profileOne.openTask = 5
    profileOne.jobPosition = "Senior Android Developer"
    profileOne.name = "Ko Zaw Htet Naing"

    val profileThree = ProfilesVO()
    profileThree.profileImage = "https://storage.googleapis.com/mmds_digi_learn/users/profiles/img_5f1182b9c7a2b_1594983097.jpg"// ""
//    profileTwo.closedTask = 784
//    profileTwo.openTask = 3
//    profileTwo.jobPosition = "UI Designer"
//    profileTwo.name = "Zachary Butler"

    val  profileTwo = ProfilesVO()
    profileTwo.profileImage = "https://storage.googleapis.com/mmds_digi_learn/users/profiles/img_5eff260d860c6_1593779725.png"
    profileTwo.closedTask = 218
    profileTwo.openTask = 2
    profileTwo.jobPosition = "Mobile Developer"
    profileTwo.name = "Ko Aung Ko Ko Thet"

    val profileFour = ProfilesVO()
    profileFour.profileImage = "https://storage.googleapis.com/mmds_digi_learn/users/profiles/img_5f1182b9c7a2b_1594983097.jpg"
    profileFour.closedTask = 285
    profileFour.openTask = 3
    profileFour.jobPosition = "Designer at MM Digital Solutions"
    profileFour.name = "Ko Ye Paye Sone Htun"

    return arrayListOf( profileOne, profileTwo,  profileFour, profileThree )
}