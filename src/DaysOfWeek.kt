enum class DaysOfWeek
{
    MONDAY
    {
        override fun NextDay()
        {
            println("Вторник")
            println("День недели = " + (countDay + 1))
        }

        override fun PreviousDay()
        {
            println("Воскресенье")
            println("День недели = " + 7)
        }
        override val countDay = 1
        override val named = "Понедельник"
    },
    TUESDAY
    {
        override fun NextDay()
        {
            println("Среда")
            println("День недели = " + (countDay + 1))
        }
        override fun PreviousDay()
        {
            println("Понедельник")
            println("День недели = " + (countDay - 1))
        }
        override val countDay = 2
        override val named = "Вторник"
    },
    WEDNESDAY
    {
        override fun NextDay()
        {
            println("Четверг")
            println("День недели = " + (countDay + 1))
        }
        override fun PreviousDay()
        {
            println("Вторник")
            println("День недели = " + (countDay - 1))
        }
        override val countDay = 3
        override val named = "Среда"
    },
    THURSDAY
    {
        override fun NextDay()
        {
            println("Пятница")
            println("День недели = " + (countDay + 1))
        }
        override fun PreviousDay()
        {
            println("Среда")
            println("День недели = " + (countDay - 1))
        }
        override val countDay = 4
        override val named = "Четверг"
    },
    FRIDAY
    {
        override fun NextDay()
        {
            println("Суббота")
            println("День недели = " + (countDay + 1))
        }
        override fun PreviousDay()
        {
            println("Четверг")
            println("День недели = " + (countDay - 1))
        }
        override val countDay = 5
        override val named = "Пятница"
    },
    SATURDAY
    {
        override fun NextDay()
        {
            println("Воскресенье")
            println("День недели = " + (countDay + 1))
        }
        override fun PreviousDay()
        {
            println("Пятница")
            println("День недели = " + (countDay - 1))
        }
        override val countDay = 6
        override val named = "Суббота"
    },
    SUNDAY
    {
        override fun NextDay()
        {
            println("Понедельник")
            println("День недели = " + 1)
        }
        override fun PreviousDay()
        {
            println("Суббота")
            println("День недели = " + (countDay - 1))
        }
        override val countDay = 7
        override val named = "Воскресенье"
    };
    open fun IsWeekend()
    {
        when (countDay)
        {
            in 1..5 -> println("Рабочий")
            else -> println("Выходной")
        }
    }
    open fun Info()
    {
        println("День недели: " + named)
        println("Номер дня недели: " + countDay)
        if (countDay == 6)
        {
            println("Сегодня можно хорошо отдохнуть")
        }
        else if (countDay == 7)
        {
            println("Сегодня отдых, но завтра понедельник")
        }
        else if (countDay == 1)
        {
            println("Я ненавижу понедельник")
        }
    }
    open fun NextDay()
    {

    }
    open fun PreviousDay()
    {

    }
    open val countDay = 0
    open val named = "nil"
}