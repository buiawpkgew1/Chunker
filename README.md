# Chunker

**在Minecraft Java版和基岩版之间转换世界**

Chunker是一款Java应用程序，可让您转换Java版和基岩版的我的世界世界。它提供了一个简单的界面来转换世界，并允许您在游戏的不同版本之间升级和降级世界。

支持的格式：

- 基岩版
    - 1.12.0
    - 1.13.0
    - 1.14.0 - 1.14.60
    - 1.16.0 - 1.16.220
    - 1.17.0 - 1.17.40
    - 1.18.0 - 1.18.30
    - 1.19.0 - 1.19.80
    - 1.20.0 - 1.20.80
    - 1.21.0 - 1.21.90
- Java版
    - 1.8.8
    - 1.9.0 - 1.9.3
    - 1.10.0 - 1.10.2
    - 1.11.0 - 1.11.2
    - 1.12.0 - 1.12.2
    - 1.13.0 - 1.13.2
    - 1.14.0 - 1.14.4
    - 1.15.0 - 1.15.2
    - 1.16.0 - 1.16.5
    - 1.17.0 - 1.17.1
    - 1.18.0 - 1.18.2
    - 1.19.0 - 1.19.4
    - 1.20.0 - 1.20.6
    - 1.21.0 - 1.21.6

**微软创作者文档：**
https://learn.microsoft.com/en-us/minecraft/creator/documents/chunkeroverview?view=minecraft-bedrock-stable

应用程序用法
--------

您可以在[发布部分](https://github.com/HiveGamesOSS/Chunker/releases)找到Chunker的预构建副本。
或者，请参阅构建部分，了解如何自行构建Chunker。

下载适合您操作系统的应用程序版本，然后您将能够运行Chunker的基于Electron的前端。

Chunker defaults to a maximum of 75% of available memory, you can customise this by specifying the amount when launching
Chunker e.g. `Chunker.exe -Xmx8G` for 8 gigabytes.

Chunker forwards `-Xmx` and `-Xms` to the backing JVM, if you wish to supply other options use `--java-options="..."`.

命令行界面用法
--------

**要求**

- Java 17或更高版本

您可以在[发布部分](https://github.com/HiveGamesOSS/Chunker/releases)找到Chunker的预构建副本。
或者，请参阅构建部分，了解如何自行构建Chunker。

Chunker可以作为命令行应用程序或作为用户界面运行，要将Chunker用作命令行应用程序，请执行以下命令：

`java -jar chunker-cli-VERSION.jar -i "my_world" -f BEDROCK_1_20_80 -o output`

以下参数是必需的：

- `-i` / `--inputDirectory` - 应用于输入目录的相对路径。
- `-o` / `--outputDirectory` - 应用于输出目录的相对路径。
- `-f` / `--outputFormat` - 转换为此世界的输出格式，格式为 `EDITION_X_Y_Z`，
  例如 `JAVA_1_20_5`，`JAVA_1_20`，`BEDROCK_1_19_30`。

此外，以下参数也被支持：

- `-m` / `--blockMappings` - 指向包含块映射的json文件或json对象的路径。
- `-s` / `--worldSettings` - 指向包含世界设置的json文件或json对象的路径。
- `-p` / `--pruning` - 指向包含修剪设置的json文件或json对象的路径。
- `-c` / `--converterSettings` - 指向包含转换设置的json文件或json对象的路径。
- `-d` / `--dimensionMappings` - 指向包含维度映射的json文件或json对象的路径。
- `-k` / `--keepOriginalNBT` - 指示在Chunker处理时，NBT应从输入复制到输出，仅在输出格式与输入相同的情况下支持，并且为了获得最佳效果，您需要在转换之前将输入世界复制到输出文件夹。

您可以通过访问`https://chunker.app`上的高级设置 -> 转换器设置选项卡，以导出您世界的设置，CLI也支持从输入目录预加载设置。

您还可以通过提供错误的输入来获取Chunker列出可用格式，例如 `java -jar chunker-VERSION.jar -f ?`。

构建
--------

**要求**

- Git
- Java 17或更高版本
- Gradle（可选）

**注意：** Chunker分为`app`和`cli`，app提供了应用程序的Electron前端，而cli是一个纯Java应用程序，可用于转换/集成转换。

**步骤**

1. 通过`git clone git://github.com/HiveGamesOSS/Chunker.git`克隆此仓库。
2. 通过`./gradlew build`构建项目。
3. 从`build/libs/`获取二进制文件（可以是CLI jar、原生CLI可执行文件或带有Electron前端）。

Chunker还使用它自己分叉的Java LevelDB实现，地址是：https://github.com/HiveGamesOSS/leveldb-mcpe-java/。

测试
--------

Chunker尽可能地进行自动化测试以验证数据，例如，块标识符会根据基岩版和Java版的调色板进行验证，这允许在构建过程中识别映射错误的问题。您可以通过在`./gradlew build`命令后附加 `-x test` 来跳过构建过程中的测试。

一些测试已从默认测试套件中排除，这些测试标记有“LongRunning”标签，这是因为它们可能需要几分钟才能完全完成。

当前不支持的功能
--------
使用Chunker时，以下功能不进行转换（或转换有限）：

- 实体（不包括画作/物品框）。
- 结构数据（例如村庄/要塞）。

许可证和法律
--------

该项目采用MIT许可证，相关细节请参见[LICENSE](LICENSE)。

该项目由蜂巢游戏（Hive Games）维护。本项目获得了Mojang Studios的资助。Mojang Studios及其母公司微软对本项目的内容不承担任何责任。

我们正在招聘！
--------

加入维护Chunker、Minecraft特色服务器“The Hive”等的Hive Games公司！
[查看我们的招聘页面。](https://jobs.playhive.com/software-engineer-java-186860/)
