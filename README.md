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
|![login](https://private-user-images.githubusercontent.com/168606293/332994259-272c8e2d-4f5c-4639-958c-2999de03e6fd.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTcxMzY5NjcsIm5iZiI6MTcxNzEzNjY2NywicGF0aCI6Ii8xNjg2MDYyOTMvMzMyOTk0MjU5LTI3MmM4ZTJkLTRmNWMtNDYzOS05NThjLTI5OTlkZTAzZTZmZC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTMxJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUzMVQwNjI0MjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT05YzQ4ODE4MDFiM2QwYWZiMzhkN2MxMTYxNWI1ODUyZTQ1ZmQ0NzI3OTAzYmJiYTAwNjUxMDE3Njg5NTZiNjY0JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.9buNMWKJV2okwfNwI0e9q6NvnqMr6Q7nWYLHvY5-PbM)|![resist](https://private-user-images.githubusercontent.com/168606293/332994262-cf8d0901-df8d-4097-be2a-f47b72e16ef9.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTcxMzY5NjcsIm5iZiI6MTcxNzEzNjY2NywicGF0aCI6Ii8xNjg2MDYyOTMvMzMyOTk0MjYyLWNmOGQwOTAxLWRmOGQtNDA5Ny1iZTJhLWY0N2I3MmUxNmVmOS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTMxJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUzMVQwNjI0MjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0wMDRiOGI2OTZhMjkwZjQxZmI5NmU2ZTU3ZDc1NzkwNmUzYmNkZjY2NmZmYTdlZWQ3YTAzZTY4NDMxYjU2MmQ4JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.hD4ZzlBbil7Dvuw0ldp1g72_4hq6T8n112OVYk6EOO8)|
|ログイン画面。グーグルアカウントでもログイン可能。|ログイン画面の「新しく登録する」を押すと表示される。|

|タイトル画面|遊び方ポップアップ|
|-----|-----|
|![title](https://private-user-images.githubusercontent.com/168606293/332994266-f20e6b1b-15cd-4b2e-b43e-1f1496f44b4b.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTcxMzY5NjcsIm5iZiI6MTcxNzEzNjY2NywicGF0aCI6Ii8xNjg2MDYyOTMvMzMyOTk0MjY2LWYyMGU2YjFiLTE1Y2QtNGIyZS1iNDNlLTFmMTQ5NmY0NGI0Yi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTMxJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUzMVQwNjI0MjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT00OGYxZDVlZGZmZjdiZmE4ZWEwZGUzZjRiMzNmMDY5NTczNjk4MTMzMzc2NjdkNTllYjllNmEwMDYwNjc3MzM4JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.tCiCfSbDQzX9h_HdLM0M7L6wuAoN-p0cFEcPt7peSJM)|![HowTo](https://private-user-images.githubusercontent.com/168606293/332994255-0b63c0cb-766e-4003-8ea2-d755b57aabe0.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTcxMzY5NjcsIm5iZiI6MTcxNzEzNjY2NywicGF0aCI6Ii8xNjg2MDYyOTMvMzMyOTk0MjU1LTBiNjNjMGNiLTc2NmUtNDAwMy04ZWEyLWQ3NTViNTdhYWJlMC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTMxJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUzMVQwNjI0MjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT02NDIwYzBkMTYwNDcwNWUxNDY0OGNiNmY3NGRlMjE2YjdmMzFhY2FjN2Y5OWUwZTE5NzQ3YWNkNmNkOTY0NzljJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.PU0UwIJRt0HUAf9uskCZTMqD9-mIKNFML_JXmInX-fs)|
|ログインに成功すると移動。「スタート」を押すとプレイ画面、「やめる」を押すとログイン画面に移動。|タイトル画面の「遊び方」を押すと表示される。|

|プレイ画面1|プレイ画面2|リザルト画面|
|-----|-----|-----|
|![answer](https://private-user-images.githubusercontent.com/168606293/332994252-dff159b9-a0f9-4f1c-9a33-af50b6448360.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTcxMzY5NjcsIm5iZiI6MTcxNzEzNjY2NywicGF0aCI6Ii8xNjg2MDYyOTMvMzMyOTk0MjUyLWRmZjE1OWI5LWEwZjktNGYxYy05YTMzLWFmNTBiNjQ0ODM2MC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTMxJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUzMVQwNjI0MjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yNzdmZDZiODE5NGVmZWExNjE5Y2VhZWQxNTRiMDBiZmE5ZjJiMmZjZDI1NmUwODY2ZWY4MGNhY2IzYjc2OWU4JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.711YLMRMKWhLe9V7WjlNOaGfcwpg546SSPrFkD-YfHo)|![play](https://private-user-images.githubusercontent.com/168606293/332994261-4405b0db-530a-49c6-ad8f-6340c07ae4b1.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTcxMzY5NjcsIm5iZiI6MTcxNzEzNjY2NywicGF0aCI6Ii8xNjg2MDYyOTMvMzMyOTk0MjYxLTQ0MDViMGRiLTUzMGEtNDljNi1hZDhmLTYzNDBjMDdhZTRiMS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTMxJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUzMVQwNjI0MjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT03NzllNGIzZDI2MGZiNDMzODA2MTA2NmQzMDgzY2UyNWNhMWY0MTNmMTczNWQwOTM5ZDhiNGE2OGQ4MDVhNWFmJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.MPvKu_u2YTdbos--v53XUWXzwbSgMpchz1rkFbWaZuY)|![result](https://private-user-images.githubusercontent.com/168606293/332994263-b9d77165-e282-4b63-9a5f-a41cacfd7d1b.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTcxMzY5NjcsIm5iZiI6MTcxNzEzNjY2NywicGF0aCI6Ii8xNjg2MDYyOTMvMzMyOTk0MjYzLWI5ZDc3MTY1LWUyODItNGI2My05YTVmLWE0MWNhY2ZkN2QxYi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTMxJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUzMVQwNjI0MjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1iNDkwMGRhM2VlMDYzZjdlMGJiMTRkNWQxZGM0OWQzY2NkYzNiMzQ3ZTlhYmNhNTBhZTVlY2E4MGM5MjU3YjQzJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.TxCidKNv9XKp02RKTS7c_IYEbEiQcw5R6AkvETeLbww)|
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
