window.addEventListener("DOMContentLoaded", () => {

class User {
    constructor(username, password) {
        this.username = username;
        this.password = password;
    }
}

const form = document.querySelector("#login");
      

form.addEventListener("submit", (e) => {
    e.preventDefault();
    const formData = new FormData(form),
          request = new XMLHttpRequest(),
          user = new User(formData.get("username"), formData.get("password"));
    request.open("POST", "http://localhost:8080/demo/auth");
    console.log(JSON.stringify(user));
    request.setRequestHeader('Content-Type', 'application/json');
    request.send(JSON.stringify(user));
    request.addEventListener("load", () => {
        console.log(JSON.parse(request.response).token);
        localStorage.setItem("token", JSON.parse(request.response).token);
        window.location.href = 'http://localhost:8080/';
    });
    });
    
});


//     // URL, на который нужно выполнить переход
// const url = 'localhost:8080/';
// // Заголовок авторизации
// const headers = {
//   'Authorization': 'Bearer ' + yourAccessToken // Замените yourAccessToken на ваш токен авторизации
// };

// // Выполняем запрос с использованием Fetch API
// fetch(url, {
//   method: 'GET', // или другой HTTP метод, который вам нужен
//   headers: headers
// })
//   .then(response => {
//     if (response.status === 200) {
//       // Успешный ответ, можно обработать его, например, перейти на страницу
//       window.location.href = url;
//     } else {
//       // Обработка ошибки
//       console.error('Ошибка при выполнении запроса:', response.status);
//     }
//   })
//   .catch(error => {
//     console.error('Произошла ошибка при выполнении запроса:', error);
//   });
// })