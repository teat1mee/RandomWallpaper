**RandomWallpaper**

A Linux application with a GNOME environment that randomly changes the desktop wallpaper to an image from a specified folder.

INSTALLATION AND LAUNCH

1. Clone the repository:
   ```git clone https://github.com/teat1mee/RandomWallpaper.git```
   ```cd RandomWallpaper```

2. Compile the source code:
``javac -d bin src/RandomWallpaper.java ``

3. Launch the application:
``java -cp bin RandomWallpaper``

requirements
- Linux with GNOME environment (tested on GNOME 3+)
- Java 8 or higher
- Folder with images (default: /home/tea/Images/Desktop/)
- Access to the gsettings command (usually available by default)

Supported formats: .jpg, .jpeg, .png, .bmp.

HOW IT WORKS
The program scans the specified folder, selects a random image and sets it as wallpaper using the command:
gsettings set org.gnome.desktop.background picture-uri "file:///path/to/file"

CHANGING THE PATH TO THE WALLPAPER FOLDER
1. Open the file ``src/RandomWallpaper.java ``
2. Find the line:
     ``private static final String FOLDER_PATH = "/home/tea/Images/Desktop/";``
3. Replace the path with your own (always with a final slash):
    `` private static final String FOLDER_PATH ="/your/path/to/wallpaper/";``
4. Recompile:
     ```javac -d bin src/RandomWallpaper.java```

   
   **To launch using a hotkey: **

    Open Settings → Keyboard → Keyboard shortcuts
    Click "+", specify:
       Name: Random Wallpaper
       Command: java -jar /полный/путь/wallpaper-changer.jar
Combination: for example, Ctrl+Alt+W
     

license
The project is distributed under the MIT license.

----------------------------------------------------------------------------------------------------------------------------------

Приложение для Linux с окружением GNOME, которое случайным образом меняет обои рабочего стола на изображение из указанной папки.

УСТАНОВКА И ЗАПУСК

1. Склонируйте репозиторий:
   ```git clone https://github.com/teat1mee/RandomWallpaper.git```
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

Поддерживаются форматы: .jpg, .jpeg, .png, .bmp.

КАК ЭТО РАБОТАЕТ
Программа сканирует указанную папку, выбирает случайное изображение и устанавливает его как обои с помощью команды:
  gsettings set org.gnome.desktop.background picture-uri "file:///путь/к/файлу"

ИЗМЕНЕНИЕ ПУТИ К ПАПКЕ С ОБОЯМИ
1. Откройте файл ```src/RandomWallpaper.java```
2. Найдите строку:
     ```private static final String FOLDER_PATH = "/home/tea/Изображения/Рабочий стол/";```
3. Замените путь на свой (обязательно с завершающим слэшем):
    ``` private static final String FOLDER_PATH = "/ваш/путь/к/обоям/";```
4. Перекомпилируйте:
     ```javac -d bin src/RandomWallpaper.java```

   
   **Чтобы запускать по горячей клавише: **

    Откройте Настройки → Клавиатура → Сочетания клавиш
    Нажмите "+", укажите:
       Имя: Случайные обои
       Команда: java -jar /полный/путь/wallpaper-changer.jar
       Сочетание: например, Ctrl+Alt+W
     

ЛИЦЕНЗИЯ
Проект распространяется под лицензией MIT.


