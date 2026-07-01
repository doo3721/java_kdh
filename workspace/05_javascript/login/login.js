const loginForm = document.querySelector('.login-form');
loginForm.addEventListener('submit', function(event){
    console.log('로그인 요청');

    // 브라우저의 유효성 검증 결과를 확인(required pattern 등)
    if (!loginForm.checkValidity()) {
        event.preventDefault(); // submit 취소
        // alert('아이디 또는 비밀번호를 제대로 입력해 주세요.');
        return;
    }

    console.log('로그인 요청 완료');
});