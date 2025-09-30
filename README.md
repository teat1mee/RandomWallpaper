RandomWallpaper

Приложение для Linux с окружением GNOME, которое случайным образом меняет обои рабочего стола на изображение из указанной папки.

УСТАНОВКА И ЗАПУСК

1. Склонируйте репозиторий:
  ``` git clone https://github.com/ваш-ник/RandomWallpaper.git```
   ```cd RandomWallpaper```

2. Скомпилируйте исходный код:
   ```javac -d bin src/RandomWallpaper.java```

3. Запустите приложение:
  ``` java -cp bin RandomWallpaper```

ТРЕБОВАНИЯ
- Linux с окружением GNOME (проверено на GNOME 3+)
- Java 8 или выше
- Папка с изображениями (по умолчанию: /home/tea/Изображения/Рабочий стол/)
- Доступ к команде gsettings (обычно есть по умолчанию)

Поддерживаются форматы: .jpg, .jpeg, .png, .bmp, .gif.

КАК ЭТО РАБОТАЕТ
Программа сканирует указанную папку, выбирает случайное изображение и устанавливает его как обои с помощью команды:
  gsettings set org.gnome.desktop.background picture-uri "file:///путь/к/файлу"

ИЗМЕНЕНИЕ ПУТИ К ПАПКЕ С ОБОЯМИ
1. Откройте файл src/RandomWallpaper.java
2. Найдите строку:
     private static final String FOLDER_PATH = "/home/tea/Изображения/Рабочий стол/";
3. Замените путь на свой (обязательно с завершающим слэшем):
     private static final String FOLDER_PATH = "/ваш/путь/к/обоям/";
4. Перекомпилируйте:
     javac -d bin src/RandomWallpaper.java

ЛИЦЕНЗИЯ
Проект распространяется под лицензией MIT.
