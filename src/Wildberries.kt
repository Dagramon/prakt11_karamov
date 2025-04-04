enum class Status
{
    NOTPAYED
    {
      override var named = "Неоплачен"
        override var arriveIn = 5
    },
    PAYED
    {
        override var named = "Оплачен"
        override var arriveIn = 5
    },
    INITIALIZED
    {
        override var named = "Обработан"
        override var arriveIn = 4
    },
    ONWAY
    {
        override var named = "В пути"
        override var arriveIn = 3
    },
    ONSORTING
    {
        override var named = "На сортировке"
        override var arriveIn = 2
    },
    ONDESTINATION
    {
        override var named = "На пункте"
        override var arriveIn = 0
    },
    COMPLETED
    {
        override var named = "Выполнен"
        override var arriveIn = 0
    },
    CANCELLED
    {
        override var named = "Отменён"
        override fun Info()
        {
            println("Заказ отменён")
        }
    };
    open fun TovarName()
    {
        print("Введите название товара: ")
        tovar = readln()
    }
    open fun Info()
    {
        println("Товар: " + tovar)
        println("Статус заказа: " + named)
        println("Прибудет через: " + arriveIn)
        if (named == "Неоплачен")
        {
            println("Нужно оплатить заказ")
        }
        else if (named == "В пункте")
        {
            println("Нужно забрать заказ")
        }
    }
    open fun Cancel() {
        named = "Отменён"
        arriveIn = 0
        println("Заказ отменён")
    }
    open fun Delay()
    {
        arriveIn += 5
        println("Отложен на 5 дней")
    }
    open var named = ""
    open var arriveIn = 0
    open var tovar = "Неизвестно"
}