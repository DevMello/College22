package main

import (
	"fmt"
	"net/http"
)

func main() {
	//var templates *template.Template
	//templates = template.Must(template.ParseFiles("index.html"))
	//templates.ExecuteTemplate(os.Stdout, "index.html", nil)
	http.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {
		fmt.Fprintf(
			w, `<h1>Hello, Gophers</h1>
    <p>You're learning about web development, so</p>
    <p>you might want to learn about the common HTML tags</p>`,
		)
		fmt.Fprintf(w, "Welcome to a page about ", r.URL.Path[1:])

	})
	http.HandleFunc("/about", indexPage)
	http.ListenAndServe(":8000", nil)
}
func indexPage(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w, "Welcome to a page about ", r.URL.Path[1:])
}
