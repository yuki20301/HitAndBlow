# 「ヒットアンドブロー」

## 概要
51種類の様々なゲームが楽しめる某ゲームソフトでおなじみのヒットアンドブローに、ログイン機能やランキングを載せてwebゲーム風に作成しました。

#### ※ヒットアンドブローとは  
  「マインドスポーツ」と呼ばれるジャンルの一つで、隠された数字もしくは4つの球の色をなるべく最短手で当てるボードゲーム。  
  予想をして返ってきた「ヒット」、「ブロー」の数をもとに次の予想をする。これを答えと予想が一致するまで繰り返し行う。  
  数回予想をしたときに得られた情報から、正解を導き出した時の爽快感が魅力のゲーム。

## 機能一覧

|トップ画面（ログイン画面）|新規登録画面|
|-----|-----|
|![login](https://private-user-images.githubusercontent.com/168606293/327324586-dbf07834-ff94-4711-bc92-dec307c832c6.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTQ2Mjk3MzUsIm5iZiI6MTcxNDYyOTQzNSwicGF0aCI6Ii8xNjg2MDYyOTMvMzI3MzI0NTg2LWRiZjA3ODM0LWZmOTQtNDcxMS1iYzkyLWRlYzMwN2M4MzJjNi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTAyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUwMlQwNTU3MTVaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0xZGQ2YWZkMzIxYjVmNjg4N2UwMDlhMDIyZDFmNzY0NDlkZDFkOWE4NWE2OWJiZGNkODAxNjg3NTg1MDNiMWVhJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.OqobfvDlrdrCfveBWMGEUEAxZcwDclTPJyF0Hitza8k)|![resist](https://private-user-images.githubusercontent.com/168606293/327324716-0f766655-29b0-4350-ab49-090bbfd5aa9f.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTQ2Mjk3OTEsIm5iZiI6MTcxNDYyOTQ5MSwicGF0aCI6Ii8xNjg2MDYyOTMvMzI3MzI0NzE2LTBmNzY2NjU1LTI5YjAtNDM1MC1hYjQ5LTA5MGJiZmQ1YWE5Zi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTAyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUwMlQwNTU4MTFaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT04YTM2N2U5NTIwOWNlNWM1YjM5MjQyY2M0ZTcwY2E0NTdiZTU3MjBjNDcwYmQwZjJiNThkN2QyNmVmOTcxNjU2JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.JyW-0m1703tdtx3qbzfP1acM4R23m3Dg5_404qrgWr8)|
|ログイン画面。グーグルアカウントでもログイン可能。|ログイン画面の「新しく登録する」を押すと表示される。|

|タイトル画面|遊び方ポップアップ|
|-----|-----|
|![title](https://private-user-images.githubusercontent.com/168606293/327324186-73c22008-29e4-4997-be91-4ccf0a8764f4.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTQ2Mjk2MDIsIm5iZiI6MTcxNDYyOTMwMiwicGF0aCI6Ii8xNjg2MDYyOTMvMzI3MzI0MTg2LTczYzIyMDA4LTI5ZTQtNDk5Ny1iZTkxLTRjY2YwYTg3NjRmNC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTAyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUwMlQwNTU1MDJaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT00OTJmMmFkOTY2ZGQxOGFkOGUwOTczMTI4ZjM1NDEzOGQ3ZmVmMzVkNDNkOGVlNWYyNDgzNTRlMjNiNDQ5MTRiJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.DwmutFdkajmcVuEpIj60V1Y2l8eC4Nb6-B1CP6e3o3w)|![HowTo](https://private-user-images.githubusercontent.com/168606293/327325038-decbc552-f4a4-4958-8e46-b822552850f0.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTQ2Mjk4OTIsIm5iZiI6MTcxNDYyOTU5MiwicGF0aCI6Ii8xNjg2MDYyOTMvMzI3MzI1MDM4LWRlY2JjNTUyLWY0YTQtNDk1OC04ZTQ2LWI4MjI1NTI4NTBmMC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTAyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUwMlQwNTU5NTJaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT04MTkyMjlkNWJkZmU2MzcxNTUzZmViYTBmZjYxOWVhMzQ0ZGJiN2IwOTQwMDE5YzFkNTA5NWQzYjU5ZTMyODQ3JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.ZpM9KRRG-JwsszMTRVIT_i5fkq9m8pFNFCO09rYqHDc)|
|ログインに成功すると移動。「スタート」を押すとプレイ画面、「やめる」を押すとログイン画面に移動。|タイトル画面の「遊び方」を押すと表示される。|

|プレイ画面1|プレイ画面2|リザルト画面|
|-----|-----|-----|
|![answer](https://private-user-images.githubusercontent.com/168606293/327325144-246610ba-e9d9-4ee3-b275-a6a85e5e07e7.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTQ2Mjk5MzQsIm5iZiI6MTcxNDYyOTYzNCwicGF0aCI6Ii8xNjg2MDYyOTMvMzI3MzI1MTQ0LTI0NjYxMGJhLWU5ZDktNGVlMy1iMjc1LWE2YTg1ZTVlMDdlNy5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTAyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUwMlQwNjAwMzRaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT03MGEwYjIyYjAwM2RiMTEwNTMyNzM4NzhjMjJmZjI1ZDE2ODIyNjUwMGM4N2UzZTRmYTdjYjFjYWEwMTk0ZDIwJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.8_JZiTOvQjgFC8nZlodKvdgFmfksdrSMhQsYlQ-wBRI)|![play](https://private-user-images.githubusercontent.com/168606293/327324905-5ced71bd-1f35-409c-b960-361986d5da32.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTQ2Mjk4NDcsIm5iZiI6MTcxNDYyOTU0NywicGF0aCI6Ii8xNjg2MDYyOTMvMzI3MzI0OTA1LTVjZWQ3MWJkLTFmMzUtNDA5Yy1iOTYwLTM2MTk4NmQ1ZGEzMi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTAyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUwMlQwNTU5MDdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT00MThlZDYyYjYwZWY0ZTU2MDM0YWUyZTllMDY4ODlhNTNmMzg3YjliMzM4Nzg0M2RlYTBhNmNiNDEwNTg1OWQ1JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.YWlOncCdjH6y6l_MrKGpYiMmgzLWfzGyMzVwERUDI8I)|![result](https://private-user-images.githubusercontent.com/168606293/327325295-4f45e9a6-b356-4e06-b9bf-02def712fe2d.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTQ2Mjk5NzEsIm5iZiI6MTcxNDYyOTY3MSwicGF0aCI6Ii8xNjg2MDYyOTMvMzI3MzI1Mjk1LTRmNDVlOWE2LWIzNTYtNGUwNi1iOWJmLTAyZGVmNzEyZmUyZC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTAyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUwMlQwNjAxMTFaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0zZjQ1NTM1ZjFjYWQwNzc2M2VlMTk3MWQyZWU1OTdmZGQ0OWE3MjYxOWFhNTVjODQ5ZWQyNzg5Njk5NWIyOGE1JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.RgqEsfUGLAgas21UJDPaL27GM3SQLhhdgH6ycT1NmEo)|
|解答欄に入力。間違いの場合はプレイ画面のまま。「あきらめる」とタイトル画面に移動。|解答途中。予想が答えと一致したときリザルト画面に移動。|「タイトル」を押すとタイトル画面に戻る。|

## 洗い出した要件

- ゲームを遊ぶとき、クリックのみで回答したい
- ログイン機能
- ランキング機能
- 外部アカウントを用いたログイン
- 答えが重複しない
- 予想の履歴、正誤判定を表示
- 新規登録機能
- 答えに対して予想のヒット、ブロー数をチェックする

## 実装した機能について

- **クリックのみで回答**  
  各解答欄をクリックすることで、1～0までの数字が出現しその数字を選んで入力することができる。

- **ログイン機能＆新規登録**  
  データベースのユーザー情報を参照しその合否から、タイトル画面へ遷移するかメッセージ表示させてログイン画面に戻す機能にした。

- **ランキング機能**  
  データベースのユーザー情報に各々でデータを格納し、タイトル画面で全ユーザーのうち上位3人を表示させる。

- **答えが重複しない**  
  答えが重複しないよう設定するメソッドを作成。  
  また、予想の解答欄もjavaScriptを用いて選択された数字は入力できないようにした。

- **予想の履歴＆正誤判定**  
  答えと予想を配列に格納し、答えの1桁ずつに予想の配列をループさせる。数字が一致したとき、そのインデックス数を比較して答えの配列の次に移る。
  その結果を予想と共に配列に格納、予想の履歴として使用した。

## データベース設計


| Field          | Type         | Null | Key | Default | Extra             |
|----------------|--------------|------|-----|---------|-------------------|
| id             | int          | NO   | PRI | NULL    | auto_increment    |
| user_name      | varchar(10)  | NO   |     | NULL    |                   |
| email          | varchar(255) | NO   |     | NULL    |                   |
| password       | char(64)     | NO   |     | NULL    |                   |
| num_of_play[^1]| int          | YES  |     | 0       |                   |
| total[^2]      | int          | YES  |     | 0       |                   |
| shortest_clear[^3]| int       | YES  |     | 0       |                   |
| longest_clear[^4]| int        | YES  |     | 0       |                   |
| last_play  [^5]| varchar(20)  | YES  |     | NULL    |                   |
| num_of_clear[^6]| int         | YES  |     | 0       | DEFAULT_GENERATED |
| average    [^7]| varchar(5)   | YES  |     | 99.00   |                   |

[^1]:遊んだ回数。あきらめたときも加算される。
[^2]:累計予想回数。あきらめたときも加算される。平均クリア予想回数を算出するときに用いる。
[^3]:最速クリア記録。ランキングに用いる。
[^4]:最遅クリア記録。
[^5]:最後にプレイした日。
[^6]:クリアした回数。平均クリア予想回数を算出するときに用いる。
[^7]:平均クリア予想回数。


## 開発環境

|環境一覧|
|:---|
|eclipse 4.30.0|
|Spring 3.2.4|
|java 17.0.10|
|MySQL|
|HTML|
|css|
|javaScript|
|GitHub|

## 苦労した点

様々なエラーに対して原因を探るところが一番苦労しました。  
始めのうちはどこで何が起こっているのか見当もつかず、手当たり次第に"ＯＯException"で調べていました。
でも調べているうちにだんだんと"Exception"ごとにどこで起こるか傾向があることが分かり、どこでエラーが発生したか時間かからずわかるようになったかなとと思います。  
しかし、未だに調べてもわからない不可解なエラーで苦しめられており、今もなお苦労しています。

## 工夫した点

クリックで回答できるようにした点です。  
元々は`select`タグで実装しようとしていたのですが、見た目の変更が難しいとのことで`select`タグを使わずに作ることにしました。  
なかなか調べるのが大変でしたが、いくつかのサイトを参考にして実装しました。

## 実装予定の機能

- 外部アカウントを用いたログイン
- ユーザー名の変更機能

***

## 注釈
