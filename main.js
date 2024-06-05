const express=require('express'); //module import
const app=express() // express 실행

app.listen(3000, ()=>{ // 서버 생성, 포트번호:3000
    console.log('서버 시작');
}) 


app.get('/',(req,res)=>{
    console.log('루트에 대한 요청');
    res.send('루트페이지에 대한 요청');
}) 

app.get('/test',(req,res)=>{
    console.log('===> test에 대한 요청');
    res.send('test에 대한 요청');
}) //주소:3000/test치면 이 문단 뜸.


app.get('/myaong',(req,res)=>{
    console.log('===> mayong에 대한 요청');
    res.send('아임 응애에요');
})

app.get('/login',(req,res)=>{
    console.log('로그인 요청');
    res.sendFile(__dirname+'/pages/login.html')
}) 
app.get('/register',(req,res)=>{
    console.log('회원가입 요청');
    res.send('회원가입');
}) 