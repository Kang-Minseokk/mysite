import React, { useEffect } from 'react';
import logo from './logo.svg';
import './App.css';

function App() {
  useEffect(() => {
    fetch('/api/data') // Spring Boot의 API 엔드포인트
        .then(response => response.text()) // 응답 데이터를 텍스트로 변환
        .then(data => console.log(data)) // 데이터를 콘솔에 출력
        .catch(error => console.error('Error fetching data:', error)); // 에러 처리
  }, []); // 빈 배열: 컴포넌트가 처음 렌더링될 때 한 번 실행

  return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <p>
            Edit <code>src/App.js</code> and save to reload.
          </p>
          <a
              className="App-link"
              href="https://reactjs.org"
              target="_blank"
              rel="noopener noreferrer"
          >
            Learn React
          </a>
        </header>
      </div>
  );
}

export default App;
