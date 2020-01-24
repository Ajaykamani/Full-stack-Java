import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EntryformComponentComponent } from './entryform-component.component';

describe('EntryformComponentComponent', () => {
  let component: EntryformComponentComponent;
  let fixture: ComponentFixture<EntryformComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EntryformComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EntryformComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
