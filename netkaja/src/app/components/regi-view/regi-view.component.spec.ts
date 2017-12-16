import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RegiViewComponent } from './regi-view.component';

describe('RegiViewComponent', () => {
  let component: RegiViewComponent;
  let fixture: ComponentFixture<RegiViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RegiViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RegiViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
