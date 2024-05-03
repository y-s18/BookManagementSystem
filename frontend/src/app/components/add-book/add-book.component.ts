import { Component, OnInit } from '@angular/core';
import { Book } from '../../model/book';
import { BookService } from '../../services/book.service';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-add-book',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './add-book.component.html',
  styleUrl: './add-book.component.css',
})
export class AddBookComponent implements OnInit {
  book: Book = new Book();

  constructor(private bookService: BookService, private router: Router) {}

  ngOnInit(): void {}

  saveBook() {
    this.bookService.addBook(this.book).subscribe((data) => {
      console.log(data);
      this.goToBookList();
    });
  }

  goToBookList() {
    this.router.navigate(['/books']);
  }

  onSubmit() {
    console.log(this.book);
    this.saveBook();
  }
}
