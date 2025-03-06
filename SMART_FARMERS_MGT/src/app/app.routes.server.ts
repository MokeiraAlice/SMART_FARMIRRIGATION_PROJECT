import { RenderMode, ServerRoute } from '@angular/ssr';

export const serverRoutes: ServerRoute[] = [
  {
    path: '**',
    renderMode: RenderMode.Prerender
  }
];



// mport { NgModule } from '@angular/core';
// import { RouterModule, Routes } from '@angular/router';
// import { WaterBillListComponent } from './components/water-bill-list/water-bill-list.component';
// import { WaterBillFormComponent } from './components/water-bill-form/water-bill-form.component';
// import { WaterBillDetailsComponent } from './components/water-bill-details/water-bill-details.component';

// const routes: Routes = [
//   { path: '', redirectTo: '/water-bills', pathMatch: 'full' },
//   { path: 'water-bills', component: WaterBillListComponent },
//   { path: 'water-bills/create', component: WaterBillFormComponent },
//   { path: 'water-bills/edit/:id', component: WaterBillFormComponent },
//   { path: 'water-bills/:id', component: WaterBillDetailsComponent },
//   { path: '**', redirectTo: '/water-bills' }
// ];

// @NgModule({
//   imports: [RouterModule.forRoot(routes)],
//   exports: [RouterModule]
// })
// export class AppRoutingModule { }

// // Main app module
// // src/app/app.module.ts
// import { NgModule } from '@angular/core';
// import { BrowserModule } from '@angular/platform-browser';
// import { HttpClientModule } from '@angular/common/http';
// import { ReactiveFormsModule } from '@angular/forms';

// import { AppRoutingModule } from './app-routing.module';
// import { AppComponent } from './app.component';
// import { WaterBillListComponent } from './components/water-bill-list/water-bill-list.component';
// import { WaterBillFormComponent } from './components/water-bill-form/water-bill-form.component';
// import { WaterBillDetailsComponent } from './components/water-bill-details/water-bill-details.component';

// @NgModule({
//   declarations: [],
//   imports: [
//     BrowserModule,
//     AppRoutingModule,
//     HttpClientModule,
//     ReactiveFormsModule,
//     WaterBillListComponent,
//     WaterBillFormComponent,
//     WaterBillDetailsComponent
//   ],
//   providers: [],
//   bootstrap: [AppComponent]
// })
// export class AppModule { }