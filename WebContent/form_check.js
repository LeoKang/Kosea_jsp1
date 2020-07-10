function check() {
	if(document.frm.pname.value == "") {
		alert("이름을 입력해주세요.");
		document.frm.pname.focus();
		return false;
	}else if(document.frm.psn.value == "") {
		alert("주민등록번호를 입력해주세요.");
		document.frm.psn.focus();
		return false;
	}else if(document.frm.pid.value == "") {
		alert("아이디를 입력해주세요.");
		document.frm.pid.focus();
		return false;
	}else if(document.frm.ppwd.value == "") {
		alert("패스워드를 입력해주세요.");
		document.frm.ppwd.focus();
		return false;
	}else if(document.frm.ppwd.value
	 != document.frm.ppwdchk.value) {
		alert("패스워드가 일치하지 않습니다.");
		document.frm.ppwd.focus();
		return false;
	}else{
		return true;
	}
}