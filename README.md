-------------------------------------------------------------------------------------------------------------<br>
操作手順です。<br>
デスクトップに.classが存在していることを前提に書きます。(今の段階では作業用PCのデスクトップに存在しているため)<br>
<br>
１、"windows key(スタートボタン) + r"を同時に押し、出てきたウィンドウに"cmd"と入力、enterを押下します。<br>
２、"cd Desktop"と入力し、enterを押下します。<br>
３、<br>
　　全角の場合<br>
　　　　"java DummyData 8000"<br>
　　半角の場合<br>
　　　　"java DummyData_hankaku 8000"<br>
　　と入力し、enterを押下します。<br>
４、"dummy_data.txt"と名前の付いたファイルが出力されるので、そこからコピペで使用してください。<br>
<br><br>

もし、classファイルを削除してしまった場合は、ダウンロードしてjavacでコンパイルしてください。<br>
エンコード（文字コード）でエラーが発生した場合は、 -encoding=UTF8 オプションをつけた状態でjavacを打ってください。<br>
<br>
・javaコマンドで実行する際に、引数としてほしいデータ数（例えば8000）を与えてください。<br>
引数がない場合は実行時エラーになります。<br>
<br>
・2017年10月31日現在全角バージョン、半角バージョンの二つともすでに作業用PCのデスクトップに置いています。<br>
<br>
・全角バージョンは、半角バージョンの物を改造してくれるとありがたいです。（全角の物をそのまま半角に作り直しちゃって今手元から消えちゃってます。）<br>
ファイルを誤って消すことはないと思うので大丈夫だと思いますが。。。<br>
<br><br>
※作業PCですが、jdkは入ってますがパスが通ってないです。通してもいいかわからんので諦めてそのままやってます。<br>
なのでjavac打つときちょっとめんどくさいのでなるべくclassファイル消さないように注意してください。。。<br>
<br>
-------------------------------------------------------------------------------------------------------------<br>
<br>
仕様、メモ書き。<br>
<br>
午前中に作ったダミーデータ用のjavaです。<br>
お客さんの要望通りのダミーデータを生成してくれてると信じてます。<br>
<br>
最大出力文字数は9990文字くらいです。<br>
8000文字くらいまでしか必要ないと思ってるのでそこまでしかやってません。<br>
最大文字数増やすだけならすぐなので必要であれば修正してください。<br>
<br>
今思うと少しバグってる気がします。<br>
具体的には1文字生成とか出来ないんじゃないかな。<br>
気づいたのでパパっと修正したような気もするし、めんどくさいと思ってしてなかったような気もします。<br>
5文字以上は正常に出力されるのでまぁ使う分には困らないと思うので別に直ってなくても問題ないとは思います。<br>
<br>
REAMMEとかいうtypo起こしてたので作り直しました。<br>
