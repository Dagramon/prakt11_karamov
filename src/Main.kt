import java.awt.Color
import java.awt.Font

fun main()
{
    try {
        //1
        print("Введите день недели: ")
        val day = readln().toInt()
        var dayofweek = DaysOfWeek.MONDAY
        when (day) {
            1 -> dayofweek = DaysOfWeek.MONDAY
            2 -> dayofweek = DaysOfWeek.TUESDAY
            3 -> dayofweek = DaysOfWeek.WEDNESDAY
            4 -> dayofweek = DaysOfWeek.THURSDAY
            5 -> dayofweek = DaysOfWeek.FRIDAY
            6 -> dayofweek = DaysOfWeek.SATURDAY
            7 -> dayofweek = DaysOfWeek.SUNDAY
            else -> println("Невернно выбран день недели")
        }
        println(dayofweek.name)
        println("Номер в enum " + dayofweek.ordinal)
        dayofweek.Info()
        dayofweek.IsWeekend()
        println("Следующий день: ")
        dayofweek.NextDay()
        println("Вчерашний день: ")
        dayofweek.PreviousDay()
        //2
        println("----------------------------------------------")
        var color = Colors.RED
        print("1 - Красный\n2 - Зелёный\n3 - Синий\n4 - Жёлтый\n5 - Оранжевый\n6 - Фиолетовый\n7 - Чёрный\n8 - Белый\nВыберите цвет: ")
        val select = readln().toInt()
        when (select) {
            1 -> color = Colors.RED
            2 -> color = Colors.GREEN
            3 -> color = Colors.BLUE
            4 -> color = Colors.YELLOW
            5 -> color = Colors.ORANGE
            6 -> color = Colors.PURPLE
            7 -> color = Colors.BLACK
            8 -> color = Colors.WHITE
            else -> println("Неверно выбран цвет")
        }
        println(color.name)
        println("Номер в enum " + color.ordinal)
        color.Info()
        color.IsPrimary(color.name)
        print("Осветлить: ")
        color.Brighten()
        print("Затемнить: ")
        color.Darken()
        //3
        println("----------------------------------------------\nПервый заказ")
        var zakaz = Status.NOTPAYED
        zakaz = Status.PAYED
        zakaz.TovarName()
        zakaz.Info()
        println("----------------------------------------------\nВторой заказ")
        zakaz = Status.INITIALIZED
        zakaz.Info()
        println("----------------------------------------------\nТретий заказ")
        zakaz = Status.ONWAY
        zakaz.Delay()
        zakaz.Info()
        println("----------------------------------------------\nЧетвёртый заказ")
        zakaz = Status.ONSORTING
        zakaz.Info()
        println("----------------------------------------------\nПятый заказ")
        zakaz = Status.ONDESTINATION
        zakaz.Info()
        println("----------------------------------------------\nШестой заказ")
        zakaz = Status.COMPLETED
        zakaz.Info()
        println("----------------------------------------------\nСедьмой заказ")
        zakaz = Status.CANCELLED
        zakaz.Cancel()
        zakaz.Info()
    }
    catch (e:Exception)
    {
        println("Неверный формат ввода")
    }
}