#17.Моделирование работы курьерской службы
Курьерская служба создана для оперативной пересылки корреспонденции
(служебных писем) между N (3≤ N ≤ 7) филиалами крупной фирмы.
Пересылка осуществляется несколькими (1≤ М ≤ 5) курьерами
службы, работой которых управляет диспетчер. Курьеры могут перевозить более
одного письма, в начале рабочего дня они рассредоточены по филиалам фирмы.
Известно среднее время, необходимое для переезда курьера из одного
конкретного филиала в другой.
Требуется разработать систему, моделирующую функции диспетчера,
который фиксирует поступающие в течение рабочего дня (с 9.00 до 18.00 вечера)
заявки на пересылку корреспонденции и
организует работу курьеров. Заявки на пересылку поступают случайным
образом, но их распределение неравномерно по филиалам и времени дня,
максимальное количество заявок возникает в середине рабочего дня. Заявка
включает указание филиала, являющегося пунктом отправления письма;
указание пункта назначения отправляемого письма, а также допустимый срок
доставки (срочность доставки).
Цель моделирования – сбор информации о работе курьеров для
последующей оптимизации курьерской службы: например, необходимо найти
число курьеров, при котором сокращается общее время «холостых» переездов
курьеров между филиалами фирмы (т.е. переездов без перевозки писем). Период
моделирования – одна неделя, шаг моделирования – полчаса или час.
Интервал между появлением двух заявок следует моделировать как
случайную величину из определенного диапазона (например, от 2 до 20 минут) –
от этого диапазона зависит плотность потока заявок. Случайным образом
определяются и составляющие заявки: пункты отправления и назначения и
срочность заявки. Фактическое время доставки
письма курьером отличается от среднего (обычного) времени на величину
случайного отклонения (изменяется в диапазоне от –5 до 30 минут).
В параметры моделирования следует включить числа М и N, шаг
моделирования, диапазоны изменения вышеуказанных случайных величин.
Визуализация работы курьерcкой службы может включать показ схемы
расположения филиалов фирмы, на которой указывается текущее
местоположение курьеров и номера выполняемых ими заявок. Отображаются
также списки всех поступивших и выполненных заявок, для последних должно
быть также указано время начала и окончания их выполнения. По окончании
моделирования должна выводиться статистическая информация, в том числе –
показатели занятости курьеров фирмы, средняя длительность их поездок, общее
время «холостых» переездов.