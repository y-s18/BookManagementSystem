import { Routes } from '@angular/router';
import { BookListComponent } from './components/book-list/book-list.component';
import { AddBookComponent } from './components/add-book/add-book.component';
import { UpdateBookComponent } from './components/update-book/update-book.component';
import { BookDetailsComponent } from './components/book-details/book-details.component';

export const routes: Routes = [
  {path: 'books', component: BookListComponent},
  {path: 'add-book', component: AddBookComponent},
  {path: '', redirectTo: 'books', pathMatch: 'full'},
  {path: 'update-book/:id', component: UpdateBookComponent},
  {path: 'book-details/:id', component: BookDetailsComponent}
];
