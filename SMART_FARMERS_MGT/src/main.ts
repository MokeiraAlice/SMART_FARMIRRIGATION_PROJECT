import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { AppComponent } from './app/app.component';
import { provideRouter } from '@angular/router';
import { provideHttpClient, withFetch } from '@angular/common/http';
import { routes } from './app/app.routes';

// Single bootstrap call with merged configuration
bootstrapApplication(AppComponent, {
  providers: [
    // Existing app configuration
    ...appConfig.providers,  // Spread existing providers from appConfig
    
    // Add HTTP client with Fetch API
    provideHttpClient(withFetch()),
    
    // Router configuration (if not already in appConfig)
    provideRouter(routes)
  ]
}).catch((err) => console.error(err));