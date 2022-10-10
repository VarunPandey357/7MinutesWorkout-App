package com.smalltide.a7minutesworkout

object Constants {

    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()

        val jumpingJacks = ExerciseModel(
            1,
            "Jumping Jacks",
            R.drawable.ic_jumping_jacks,
            false,
            false
        )
        exerciseList.add(jumpingJacks)

        val wallSit = ExerciseModel(2,"Wall Sit",R.drawable.ic_wall_sit,false,false )
        exerciseList.add(wallSit)

        val pushUp = ExerciseModel(3,"Push Up",R.drawable.ic_push_up,false,false )
        exerciseList.add(pushUp)

        val abdominalCrunch = ExerciseModel(4,"Abdominal Crunch",R.drawable.ic_abdominal_crunch,false,false)
        exerciseList.add(abdominalCrunch)

        val stepUpOnChair = ExerciseModel(5,"Step Up On Chair",R.drawable.ic_step_up_onto_chair)
        exerciseList.add(stepUpOnChair)

        val squat = ExerciseModel(6,"Squat",R.drawable.ic_squat)
        exerciseList.add(squat)

        val tricepDipOnChair = ExerciseModel(7,"Tricep Dip On Chair",R.drawable.ic_triceps_dip_on_chair)
        exerciseList.add(tricepDipOnChair)

        val plank = ExerciseModel(8,"Plank",R.drawable.ic_plank)
        exerciseList.add(plank)

        val highKneesRunningInPlace = ExerciseModel(9,"High Knees Running In Place",R.drawable.ic_high_knees_running_in_place)
        exerciseList.add(highKneesRunningInPlace)

        val lunges = ExerciseModel(10,"Lunges",R.drawable.ic_lunge)
        exerciseList.add(lunges)

        val pushUpAndRotation = ExerciseModel(11,"Push Up And Rotation",R.drawable.ic_push_up_and_rotation)
        exerciseList.add(pushUpAndRotation)

        val sidePlank = ExerciseModel(12,"Side Plank",R.drawable.ic_side_plank)
        exerciseList.add(sidePlank)

        return exerciseList
    }
}