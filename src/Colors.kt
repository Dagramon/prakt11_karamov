enum class Colors
{
    RED
    {
        override val named = "Красный"
        override val rgb = "#FF0000"
        override fun Brighten()
        {
            println("Розовый")
        }
        override fun Darken()
        {
            println("Бардовый")
        }
    },
    GREEN
    {
        override val named = "Зелёный"
        override val rgb = "#00FF00"
        override fun Brighten()
        {
            println("Салатовый")
        }
        override fun Darken()
        {
            println("Тёмно-зелёный")
        }
    },
    BLUE
    {
        override val named = "Синий"
        override val rgb = "#0000FF"
        override fun Brighten()
        {
            println("Голубой")
        }
        override fun Darken()
        {
            println("Тёмно-синий")
        }
    },
    YELLOW
    {
        override val named = "Жёлтый"
        override val rgb = "#F8E71C"
        override fun Brighten()
        {
            println("Кремовый")
        }
        override fun Darken()
        {
            println("Тёмно-желтый")
        }
    },
    ORANGE
    {
        override val named = "Оранжевый"
        override val rgb = "#F5A623"
        override fun Brighten()
        {
            println("Кремовый")
        }
        override fun Darken()
        {
            println("Коричневый")
        }
    },
    PURPLE
    {
        override val named = "Фиолетовый"
        override val rgb = "#9013FE"
        override fun Brighten()
        {
            println("Ярко-Фиолетовый")
        }
        override fun Darken()
        {
            println("Тёмно-фиолетовый")
        }
    },
    BLACK
    {
        override val named = "Чёрный"
        override val rgb = "#000000"
        override fun Brighten()
        {
            println("Белый")
        }
        override fun Darken()
        {
            println("Чёрный")
        }
    },
    WHITE
    {
        override val named = "Белый"
        override val rgb = "#FFFFFF"
        override fun Brighten()
        {
            println("Белый")
        }
        override fun Darken()
        {
            println("Чёрный")
        }
    };
    open fun IsPrimary(color : String)
    {
        when (color)
        {
            "RED" -> println("Основной")
            "GREEN" -> println("Основной")
            "BLUE" -> println("Основной")
            else -> println("Не основной")
        }
    }
    open fun Brighten()
    {

    }
    open fun Darken()
    {

    }
    open fun Info()
    {
        println("Название: " + named)
        println("Код: " + rgb)
        if (named == "Красный")
        {
            println("Первый цвет в радуге")
        }
        else if (named == "Оранжевый")
        {
            println("Второй цвет в радуге")
        }
    }
    open val named = "nil"
    open val rgb = "#000000"
}