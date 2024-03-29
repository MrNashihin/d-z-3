package com.msaggik.thirdlessonsearchengine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // поля
    private EditText input;
    private TextView output;
    private Button button;
    private Algorithm algorithm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // создание объекта алгоритма
        algorithm = new Algorithm();

        // привязка к разметке
        input = findViewById(R.id.input);
        output = findViewById(R.id.output);
        button = findViewById(R.id.button);

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // считывание введённых данных
            String inputString = input.getText().toString();
            // применение метода алгоритма поиска и подсчёта количества найденных слов
            long count = algorithm.searchCount(inputString, poem);
            // вывод полученных данных на экран
            output.setText("Было найденно " + count + " слов");
        }
    };

    private String poem = "На берегу пустынных волн\n" +
            "Стоял он, дум великих полн,\n" +
            "И вдаль глядел. Пред ним широко\n" +
            "Река неслася; бедный чёлн\n" +
            "По ней стремился одиноко.\n" +
            "По мшистым, топким берегам\n" +
            "Чернели избы здесь и там,\n" +
            "Приют убогого чухонца;\n" +
            "И лес, неведомый лучам\n" +
            "В тумане спрятанного солнца,\n" +
            "Кругом шумел.\n" +
            "\n" +
            "И думал он:\n" +
            "Отсель грозить мы будем шведу,\n" +
            "Здесь будет город заложен\n" +
            "На зло надменному соседу.\n" +
            "Природой здесь нам суждено\n" +
            "В Европу прорубить окно,\n" +
            "Ногою твердой стать при море.\n" +
            "Сюда по новым им волнам\n" +
            "Все флаги в гости будут к нам,\n" +
            "И запируем на просторе.\n" +
            "\n" +
            "Прошло сто лет, и юный град,\n" +
            "Полнощных стран краса и диво,\n" +
            "Из тьмы лесов, из топи блат\n" +
            "Вознесся пышно, горделиво;\n" +
            "Где прежде финский рыболов,\n" +
            "Печальный пасынок природы,\n" +
            "Один у низких берегов\n" +
            "Бросал в неведомые воды\n" +
            "Свой ветхой невод, ныне там\n" +
            "По оживленным берегам\n" +
            "Громады стройные теснятся\n" +
            "Дворцов и башен; корабли\n" +
            "Толпой со всех концов земли\n" +
            "К богатым пристаням стремятся;\n" +
            "В гранит оделася Нева;\n" +
            "Мосты повисли над водами;\n" +
            "Темно-зелеными садами\n" +
            "Ее покрылись острова,\n" +
            "И перед младшею столицей\n" +
            "Померкла старая Москва,\n" +
            "Как перед новою царицей\n" +
            "Порфироносная вдова.\n" +
            "\n" +
            "Люблю тебя, Петра творенье,\n" +
            "Люблю твой строгий, стройный вид,\n" +
            "Невы державное теченье,\n" +
            "Береговой ее гранит,\n" +
            "Твоих оград узор чугунный,\n" +
            "Твоих задумчивых ночей\n" +
            "Прозрачный сумрак, блеск безлунный,\n" +
            "Когда я в комнате моей\n" +
            "Пишу, читаю без лампады,\n" +
            "И ясны спящие громады\n" +
            "Пустынных улиц, и светла\n" +
            "Адмиралтейская игла,\n" +
            "И, не пуская тьму ночную\n" +
            "На золотые небеса,\n" +
            "Одна заря сменить другую\n" +
            "Спешит, дав ночи полчаса.\n" +
            "Люблю зимы твоей жестокой\n" +
            "Недвижный воздух и мороз,\n" +
            "Бег санок вдоль Невы широкой,\n" +
            "Девичьи лица ярче роз,\n" +
            "И блеск, и шум, и говор балов,\n" +
            "А в час пирушки холостой\n" +
            "Шипенье пенистых бокалов\n" +
            "И пунша пламень голубой.\n" +
            "Люблю воинственную живость\n" +
            "Потешных Марсовых полей,\n" +
            "Пехотных ратей и коней\n" +
            "Однообразную красивость,\n" +
            "В их стройно зыблемом строю\n" +
            "Лоскутья сих знамен победных,\n" +
            "Сиянье шапок этих медных,\n" +
            "На сквозь простреленных в бою.\n" +
            "Люблю, военная столица,\n" +
            "Твоей твердыни дым и гром,\n" +
            "Когда полнощная царица\n" +
            "Дарует сына в царской дом,\n" +
            "Или победу над врагом\n" +
            "Россия снова торжествует,\n" +
            "Или, взломав свой синий лед,\n" +
            "Нева к морям его несет\n" +
            "И, чуя вешни дни, ликует.\n" +
            "\n" +
            "Красуйся, град Петров, и стой\n" +
            "Неколебимо как Россия,\n" +
            "Да умирится же с тобой\n" +
            "И побежденная стихия;\n" +
            "Вражду и плен старинный свой\n" +
            "Пусть волны финские забудут\n" +
            "И тщетной злобою не будут\n" +
            "Тревожить вечный сон Петра!\n" +
            "\n" +
            "Была ужасная пора,\n" +
            "Об ней свежо воспоминанье…\n" +
            "Об ней, друзья мои, для вас\n" +
            "Начну свое повествованье.\n" +
            "Печален будет мой рассказ.\n" +
            "\n" +
            "\n" +
            "Часть первая\n" +
            "\n" +
            "Над омраченным Петроградом\n" +
            "Дышал ноябрь осенним хладом.\n" +
            "Плеская шумною волной\n" +
            "В края своей ограды стройной,\n" +
            "Нева металась, как больной\n" +
            "В своей постеле беспокойной.\n" +
            "Уж было поздно и темно;\n" +
            "Сердито бился дождь в окно,\n" +
            "И ветер дул, печально воя.\n" +
            "В то время из гостей домой\n" +
            "Пришел Евгений молодой…\n" +
            "Мы будем нашего героя\n" +
            "Звать этим именем. Оно\n" +
            "Звучит приятно; с ним давно\n" +
            "Мое перо к тому же дружно.\n" +
            "Прозванья нам его не нужно,\n" +
            "Хотя в минувши времена\n" +
            "Оно, быть может, и блистало\n" +
            "И под пером Карамзина\n" +
            "В родных преданьях прозвучало;\n" +
            "Но ныне светом и молвой\n" +
            "Оно забыто. Наш герой\n" +
            "Живет в Коломне; где-то служит,\n" +
            "Дичится знатных и не тужит\n" +
            "Ни о почиющей родне,\n" +
            "Ни о забытой старине.\n" +
            "Итак, домой пришед, Евгений\n" +
            "Стряхнул шинель, разделся, лег.\n" +
            "Но долго он заснуть не мог\n" +
            "В волненье разных размышлений.\n" +
            "О чем же думал он? о том,\n" +
            "Что был он беден, что трудом\n" +
            "Он должен был себе доставить\n" +
            "И независимость и честь;\n" +
            "Что мог бы бог ему прибавить\n" +
            "Ума и денег. Что ведь есть\n" +
            "Такие праздные счастливцы,\n" +
            "Ума недальнего, ленивцы,\n" +
            "Которым жизнь куда легка!\n" +
            "Что служит он всего два года;\n" +
            "Он также думал, что погода\n" +
            "Не унималась; что река\n" +
            "Всё прибывала; что едва ли\n" +
            "С Невы мостов уже не сняли\n" +
            "И что с Парашей будет он\n" +
            "Дни на два, на три разлучен.\n" +
            "Евгений тут вздохнул сердечно\n" +
            "И размечтался, как поэт:\n" +
            "\n" +
            "«Жениться? Мне? зачем же нет?\n" +
            "Оно и тяжело, конечно;\n" +
            "Но что ж, я молод и здоров,\n" +
            "Трудиться день и ночь готов;\n" +
            "Уж кое-как себе устрою\n" +
            "Приют смиренный и простой\n" +
            "И в нем Парашу успокою.\n" +
            "Пройдет, быть может, год-другой —\n" +
            "Местечко получу, Параше\n" +
            "Препоручу семейство наше\n" +
            "И воспитание ребят…\n" +
            "И станем жить, и так до гроба\n" +
            "Рука с рукой дойдем мы оба,\n" +
            "И внуки нас похоронят…»\n" +
            "\n" +
            "Так он мечтал. И грустно было\n" +
            "Ему в ту ночь, и он желал,\n" +
            "Чтоб ветер выл не так уныло\n" +
            "И чтобы дождь в окно стучал\n" +
            "Не так сердито…\n" +
            "Сонны очи\n" +
            "Он наконец закрыл. И вот\n" +
            "Редеет мгла ненастной ночи\n" +
            "И бледный день уж настает…\n" +
            "Ужасный день!\n" +
            "Нева всю ночь\n" +
            "Рвалася к морю против бури,\n" +
            "Не одолев их буйной дури…\n" +
            "И спорить стало ей невмочь…\n" +
            "Поутру над ее брегами\n" +
            "Теснился кучами народ,\n" +
            "Любуясь брызгами, горами\n" +
            "И пеной разъяренных вод.\n" +
            "Но силой ветров от залива\n" +
            "Перегражденная Нева\n" +
            "Обратно шла, гневна, бурлива,\n" +
            "И затопляла острова,\n" +
            "Погода пуще свирепела,\n" +
            "Нева вздувалась и ревела,\n" +
            "Котлом клокоча и клубясь,\n" +
            "И вдруг, как зверь остервенясь,\n" +
            "На город кинулась. Пред нею\n" +
            "Всё побежало, всё вокруг\n" +
            "Вдруг опустело — воды вдруг\n" +
            "Втекли в подземные подвалы,\n" +
            "К решеткам хлынули каналы,\n" +
            "И всплыл Петрополь как тритон,\n" +
            "По пояс в воду погружен.\n" +
            "\n" +
            "Осада! приступ! злые волны,\n" +
            "Как воры, лезут в окна. Челны\n" +
            "С разбега стекла бьют кормой.\n" +
            "Лотки под мокрой пеленой,\n" +
            "Обломки хижин, бревны, кровли,\n" +
            "Товар запасливой торговли,\n" +
            "Пожитки бледной нищеты,\n" +
            "Грозой снесенные мосты,\n" +
            "Гроба с размытого кладбища\n" +
            "Плывут по улицам!\n" +
            "Народ\n" +
            "Зрит божий гнев и казни ждет.\n" +
            "Увы! всё гибнет: кров и пища!\n" +
            "Где будет взять?\n" +
            "В тот грозный год\n" +
            "Покойный царь еще Россией\n" +
            "Со славой правил. На балкон,\n" +
            "Печален, смутен, вышел он\n" +
            "И молвил: «С божией стихией\n" +
            "Царям не совладеть». Он сел\n" +
            "И в думе скорбными очами\n" +
            "На злое бедствие глядел.\n" +
            "Стояли стогны озерами,\n" +
            "И в них широкими реками\n" +
            "Вливались улицы. Дворец\n" +
            "Казался островом печальным.\n" +
            "Царь молвил — из конца в конец,\n" +
            "По ближним улицам и дальным\n" +
            "В опасный путь средь бурных вод\n" +
            "Его пустились генералы\n" +
            "Спасать и страхом обуялый\n" +
            "И дома тонущий народ.\n" +
            "\n" +
            "Тогда, на площади Петровой,\n" +
            "Где дом в углу вознесся новый,\n" +
            "Где над возвышенным крыльцом\n" +
            "С подъятой лапой, как живые,\n" +
            "Стоят два льва сторожевые,\n" +
            "На звере мраморном верхом,\n" +
            "Без шляпы, руки сжав крестом,\n" +
            "Сидел недвижный, страшно бледный\n" +
            "Евгений. Он страшился, бедный,\n" +
            "Не за себя. Он не слыхал,\n" +
            "Как подымался жадный вал,\n" +
            "Ему подошвы подмывая,\n" +
            "Как дождь ему в лицо хлестал,\n" +
            "Как ветер, буйно завывая,\n" +
            "С него и шляпу вдруг сорвал.\n" +
            "Его отчаянные взоры\n" +
            "На край один наведены\n" +
            "Недвижно были. Словно горы,\n" +
            "Из возмущенной глубины\n" +
            "Вставали волны там и злились,\n" +
            "Там буря выла, там носились\n" +
            "Обломки… Боже, боже! там —\n" +
            "Увы! близехонько к волнам,\n" +
            "Почти у самого залива —\n" +
            "Забор некрашеный, да ива\n" +
            "И ветхий домик: там оне,\n" +
            "Вдова и дочь, его Параша,\n" +
            "Его мечта… Или во сне\n" +
            "Он это видит? иль вся наша\n" +
            "И жизнь ничто, как сон пустой,\n" +
            "Насмешка неба над землей?\n" +
            "\n" +
            "И он, как будто околдован,\n" +
            "Как будто к мрамору прикован,\n" +
            "Сойти не может! Вкруг него\n" +
            "Вода и больше ничего!\n" +
            "И, обращен к нему спиною,\n" +
            "В неколебимой вышине,\n" +
            "Над возмущенною Невою\n" +
            "Стоит с простертою рукою\n" +
            "Кумир на бронзовом коне.\n" +
            "\n" +
            "\n" +
            "Часть вторая\n" +
            "\n" +
            "Но вот, насытясь разрушеньем\n" +
            "И наглым буйством утомясь,\n" +
            "Нева обратно повлеклась,\n" +
            "Своим любуясь возмущеньем\n" +
            "И покидая с небреженьем\n" +
            "Свою добычу. Так злодей,\n" +
            "С свирепой шайкою своей\n" +
            "В село ворвавшись, ломит, режет,\n" +
            "Крушит и грабит; вопли, скрежет,\n" +
            "Насилье, брань, тревога, вой!..\n" +
            "И, грабежом отягощенны,\n" +
            "Боясь погони, утомленны,\n" +
            "Спешат разбойники домой,\n" +
            "Добычу на пути роняя.\n" +
            "\n" +
            "Вода сбыла, и мостовая\n" +
            "Открылась, и Евгений мой\n" +
            "Спешит, душою замирая,\n" +
            "В надежде, страхе и тоске\n" +
            "К едва смирившейся реке.\n" +
            "Но, торжеством победы полны,\n" +
            "Еще кипели злобно волны,\n" +
            "Как бы под ними тлел огонь,\n" +
            "Еще их пена покрывала,\n" +
            "И тяжело Нева дышала,\n" +
            "Как с битвы прибежавший конь.\n" +
            "Евгений смотрит: видит лодку;\n" +
            "Он к ней бежит как на находку;\n" +
            "Он перевозчика зовет —\n" +
            "И перевозчик беззаботный\n" +
            "Его за гривенник охотно\n" +
            "Чрез волны страшные везет.\n" +
            "\n" +
            "И долго с бурными волнами\n" +
            "Боролся опытный гребец,\n" +
            "И скрыться вглубь меж их рядами\n" +
            "Всечасно с дерзкими пловцами\n" +
            "Готов был челн — и наконец\n" +
            "Достиг он берега.\n" +
            "Несчастный\n" +
            "Знакомой улицей бежит\n" +
            "В места знакомые. Глядит,\n" +
            "Узнать не может. Вид ужасный!\n" +
            "Всё перед ним завалено;\n" +
            "Что сброшено, что снесено;\n" +
            "Скривились домики, другие\n" +
            "Совсем обрушились, иные\n" +
            "Волнами сдвинуты; кругом,\n" +
            "Как будто в поле боевом,\n" +
            "Тела валяются. Евгений\n" +
            "Стремглав, не помня ничего,\n" +
            "Изнемогая от мучений,\n" +
            "Бежит туда, где ждет его\n" +
            "Судьба с неведомым известьем,\n" +
            "Как с запечатанным письмом.\n" +
            "И вот бежит уж он предместьем,\n" +
            "И вот залив, и близок дом…\n" +
            "Что ж это?..\n" +
            "Он остановился.\n" +
            "Пошел назад и воротился.\n" +
            "Глядит… идет… еще глядит.\n" +
            "Вот место, где их дом стоит;\n" +
            "Вот ива. Были здесь вороты —\n" +
            "Снесло их, видно. Где же дом?\n" +
            "И, полон сумрачной заботы,\n" +
            "Все ходит, ходит он кругом,\n" +
            "Толкует громко сам с собою —\n" +
            "И вдруг, ударя в лоб рукою,\n" +
            "Захохотал.\n" +
            "Ночная мгла\n" +
            "На город трепетный сошла;\n" +
            "Но долго жители не спали\n" +
            "И меж собою толковали\n" +
            "О дне минувшем.\n" +
            "Утра луч\n" +
            "Из-за усталых, бледных туч\n" +
            "Блеснул над тихою столицей\n" +
            "И не нашел уже следов\n" +
            "Беды вчерашней; багряницей\n" +
            "Уже прикрыто было зло.\n" +
            "В порядок прежний всё вошло.\n" +
            "Уже по улицам свободным\n" +
            "С своим бесчувствием холодным\n" +
            "Ходил народ. Чиновный люд,\n" +
            "Покинув свой ночной приют,\n" +
            "На службу шел. Торгаш отважный,\n" +
            "Не унывая, открывал\n" +
            "Невой ограбленный подвал,\n" +
            "Сбираясь свой убыток важный\n" +
            "На ближнем выместить. С дворов\n" +
            "Свозили лодки.\n" +
            "Граф Хвостов,\n" +
            "Поэт, любимый небесами,\n" +
            "Уж пел бессмертными стихами\n" +
            "Несчастье невских берегов.\n" +
            "\n" +
            "Но бедный, бедный мой Евгений …\n" +
            "Увы! его смятенный ум\n" +
            "Против ужасных потрясений\n" +
            "Не устоял. Мятежный шум\n" +
            "Невы и ветров раздавался\n" +
            "В его ушах. Ужасных дум\n" +
            "Безмолвно полон, он скитался.\n" +
            "Его терзал какой-то сон.\n" +
            "Прошла неделя, месяц — он\n" +
            "К себе домой не возвращался.\n" +
            "Его пустынный уголок\n" +
            "Отдал внаймы, как вышел срок,\n" +
            "Хозяин бедному поэту.\n" +
            "Евгений за своим добром\n" +
            "Не приходил. Он скоро свету\n" +
            "Стал чужд. Весь день бродил пешком,\n" +
            "А спал на пристани; питался\n" +
            "В окошко поданным куском.\n" +
            "Одежда ветхая на нем\n" +
            "Рвалась и тлела. Злые дети\n" +
            "Бросали камни вслед ему.\n" +
            "Нередко кучерские плети\n" +
            "Его стегали, потому\n" +
            "Что он не разбирал дороги\n" +
            "Уж никогда; казалось — он\n" +
            "Не примечал. Он оглушен\n" +
            "Был шумом внутренней тревоги.\n" +
            "И так он свой несчастный век\n" +
            "Влачил, ни зверь ни человек,\n" +
            "Ни то ни сё, ни житель света,\n" +
            "Ни призрак мертвый…\n" +
            "Раз он спал\n" +
            "У невской пристани. Дни лета\n" +
            "Клонились к осени. Дышал\n" +
            "Ненастный ветер. Мрачный вал\n" +
            "Плескал на пристань, ропща пени\n" +
            "И бьясь об гладкие ступени,\n" +
            "Как челобитчик у дверей\n" +
            "Ему не внемлющих судей.\n" +
            "Бедняк проснулся. Мрачно было:\n" +
            "Дождь капал, ветер выл уныло,\n" +
            "И с ним вдали, во тьме ночной\n" +
            "Перекликался часовой…\n" +
            "Вскочил Евгений; вспомнил живо\n" +
            "Он прошлый ужас; торопливо\n" +
            "Он встал; пошел бродить, и вдруг\n" +
            "Остановился — и вокруг\n" +
            "Тихонько стал водить очами\n" +
            "С боязнью дикой на лице.\n" +
            "Он очутился под столбами\n" +
            "Большого дома. На крыльце\n" +
            "С подъятой лапой, как живые,\n" +
            "Стояли львы сторожевые,\n" +
            "И прямо в темной вышине\n" +
            "Над огражденною скалою\n" +
            "Кумир с простертою рукою\n" +
            "Сидел на бронзовом коне.\n" +
            "\n" +
            "Евгений вздрогнул. Прояснились\n" +
            "В нем страшно мысли. Он узнал\n" +
            "И место, где потоп играл,\n" +
            "Где волны хищные толпились,\n" +
            "Бунтуя злобно вкруг него,\n" +
            "И львов, и площадь, и того,\n" +
            "Кто неподвижно возвышался\n" +
            "Во мраке медною главой,\n" +
            "Того, чьей волей роковой\n" +
            "Под морем город основался…\n" +
            "Ужасен он в окрестной мгле!\n" +
            "Какая дума на челе!\n" +
            "Какая сила в нем сокрыта!\n" +
            "А в сем коне какой огонь!\n" +
            "Куда ты скачешь, гордый конь,\n" +
            "И где опустишь ты копыта?\n" +
            "О мощный властелин судьбы!\n" +
            "Не так ли ты над самой бездной\n" +
            "На высоте, уздой железной\n" +
            "Россию поднял на дыбы?\n" +
            "\n" +
            "Кругом подножия кумира\n" +
            "Безумец бедный обошел\n" +
            "И взоры дикие навел\n" +
            "На лик державца полумира.\n" +
            "Стеснилась грудь его. Чело\n" +
            "К решетке хладной прилегло,\n" +
            "Глаза подернулись туманом,\n" +
            "По сердцу пламень пробежал,\n" +
            "Вскипела кровь. Он мрачен стал\n" +
            "Пред горделивым истуканом\n" +
            "И, зубы стиснув, пальцы сжав,\n" +
            "Как обуянный силой черной,\n" +
            "«Добро, строитель чудотворный! —\n" +
            "Шепнул он, злобно задрожав, —\n" +
            "Ужо тебе!..» И вдруг стремглав\n" +
            "Бежать пустился. Показалось\n" +
            "Ему, что грозного царя,\n" +
            "Мгновенно гневом возгоря,\n" +
            "Лицо тихонько обращалось…\n" +
            "И он по площади пустой\n" +
            "Бежит и слышит за собой —\n" +
            "Как будто грома грохотанье —\n" +
            "Тяжело-звонкое скаканье\n" +
            "По потрясенной мостовой.\n" +
            "И, озарен луною бледной,\n" +
            "Простерши руку в вышине,\n" +
            "За ним несется Всадник Медный\n" +
            "На звонко-скачущем коне;\n" +
            "И во всю ночь безумец бедный,\n" +
            "Куда стопы ни обращал,\n" +
            "За ним повсюду Всадник Медный\n" +
            "С тяжелым топотом скакал.\n" +
            "\n" +
            "И с той поры, когда случалось\n" +
            "Идти той площадью ему,\n" +
            "В его лице изображалось\n" +
            "Смятенье. К сердцу своему\n" +
            "Он прижимал поспешно руку,\n" +
            "Как бы его смиряя муку,\n" +
            "Картуз изношенный сымал,\n" +
            "Смущенных глаз не подымал\n" +
            "И шел сторонкой.\n" +
            "Остров малый\n" +
            "На взморье виден. Иногда\n" +
            "Причалит с неводом туда\n" +
            "Рыбак на ловле запоздалый\n" +
            "И бедный ужин свой варит,\n" +
            "Или чиновник посетит,\n" +
            "Гуляя в лодке в воскресенье,\n" +
            "Пустынный остров. Не взросло\n" +
            "Там ни былинки. Наводненье\n" +
            "Туда, играя, занесло\n" +
            "Домишко ветхой. Над водою\n" +
            "Остался он как черный куст.\n" +
            "Его прошедшею весною\n" +
            "Свезли на барке. Был он пуст\n" +
            "И весь разрушен. У порога\n" +
            "Нашли безумца моего,\n" +
            "И тут же хладный труп его\n" +
            "Похоронили ради бога.";
}